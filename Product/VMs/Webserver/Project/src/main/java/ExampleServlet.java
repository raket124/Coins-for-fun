import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;

import com.orbitz.consul.Consul;
import com.orbitz.consul.HealthClient;
import com.orbitz.consul.model.health.ServiceHealth;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;


public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Consul client = Consul.builder().build();
        HealthClient healthClient = client.healthClient();


        List<ServiceHealth> nodes = healthClient.getHealthyServiceInstances("Webserver").getResponse();
        resp.getWriter().println("Found " + nodes.size() + "services.");
        for(ServiceHealth node : nodes){
            String nodeString = "";
            nodeString += node.getNode().getAddress();
            nodeString += node.getService().getPort();
            resp.getWriter().println(nodeString);
        }

        resp.setStatus(HttpStatus.OK_200);

    }
}
