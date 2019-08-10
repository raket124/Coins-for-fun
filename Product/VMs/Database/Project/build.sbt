lazy val root = (project in file("."))
	.enablePlugins(JavaAppPackaging)
	.settings(
		name := "Coins-GraphQL-Interface",
		version := "0.1",
		crossPaths := false,
		autoScalaLibrary := false,
		
		libraryDependencies ++= Seq(
		
			"org.eclipse.jetty" % "jetty-server" % "9.4.14.v20181114",
			"org.eclipse.jetty" % "jetty-servlet" % "9.4.14.v20181114",		
			"mysql" % "mysql-connector-java" % "8.0.15",
			"com.graphql-java" % "graphql-java" % "11.0"
			
		),
		
		dockerBaseImage := "openjdk:11-jdk"
	)



