lazy val root = (project in file("."))
	.enablePlugins(JavaAppPackaging)
	.settings(
		name := "Testing_something",
		version := "0.1",
		crossPaths := false,
		autoScalaLibrary := false,
		
		libraryDependencies ++= Seq(
		
			"org.eclipse.jetty" % "jetty-server" % "9.4.14.v20181114",
			"org.eclipse.jetty" % "jetty-servlet" % "9.4.14.v20181114",
			"com.orbitz.consul" % "consul-client" % "1.3.0"
		
		),
		
		dockerBaseImage := "openjdk:11-jdk"
	)



