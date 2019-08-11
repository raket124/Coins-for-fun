import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.DataFetcher;
import graphql.schema.StaticDataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class EmbeddedJettyMain {

    public static void main(String[] args) throws Exception {

        // Server server = new Server(7070);
        // ServletContextHandler handler = new ServletContextHandler(server, "/example");
        // handler.addServlet(ExampleServlet.class, "/");
        // server.start();

        DataFetcher productsDataFetcher = new DataFetcher<Objects.Coin>() {
            @Override
            public Objects.Coin get(DataFetchingEnvironment environment) {

                String match = environment.getArgument("match");

                Objects.Country cc = new Objects.Country();
                cc.setName("Frankrijk");

                Objects.Set s = new Objects.Set();
                s.setId("16");
                s.setName("Trouwerij");

                Objects.Coin c = new Objects.Coin();
                c.setCountry(cc);
                c.setId("456");
                c.setName(match);
                c.setYear(1993);
                c.setSet(s);

                return c;
            }
        };

        Data.Singleton.SetType(Data.Type.Static);
        Factories.ISet setFactory = Data.Singleton.DataSource().getSet();
        Factories.ICountry countryFactory = Data.Singleton.DataSource().getCountry();

        //Factories.ISet setFactory = new Factories.Static.Set();
        setFactory.Delete("2");

        String schema = readFile("src/main/resources/schema.graphqls", Charset.defaultCharset());
        SchemaParser schemaParser = new SchemaParser();
        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schema);

        RuntimeWiring runtimeWiring = newRuntimeWiring()
            .type("TTT", typeWiring -> typeWiring
                .dataFetcher("version", new StaticDataFetcher("0.1"))
                .dataFetcher("myCoin", productsDataFetcher)
                .dataFetcher("mySet", new StaticDataFetcher(setFactory.Spawn("3")))
                .dataFetcher("mySets", new StaticDataFetcher(setFactory.SpawnAll()))
                .dataFetcher("myCountry", new StaticDataFetcher(countryFactory.Spawn("19")))
                .dataFetcher("myCountries", new StaticDataFetcher(countryFactory.SpawnAll()))
            )
            .build();


        SchemaGenerator schemaGenerator = new SchemaGenerator();

        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);

        GraphQL build = GraphQL.newGraphQL(graphQLSchema).build();

        // ExecutionResult executionResult = build.execute("{myCoin(match: \"Hi\"){id name set{id name} country{name}}}");
        ExecutionResult executionResult = build.execute("{myCountries{id code name}}");

        System.out.println(schema);
        System.out.println("___________________");
        System.out.println(executionResult);
        System.out.println("___________________");
        System.out.println(executionResult.getData().toString());

    }

    static String readFile(String path, Charset encoding) throws Exception
    {
        Path pathToFile = Paths.get(path);
        System.out.println(pathToFile.toAbsolutePath());
        byte[] encoded = Files.readAllBytes(pathToFile);
        return new String(encoded, encoding);
    }
}
