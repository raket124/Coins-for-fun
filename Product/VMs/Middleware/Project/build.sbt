lazy val root = (project in file("."))
	.enablePlugins(JavaAppPackaging)
	.settings(
		name := "Coins-GraphQL-Interface",
		version := "0.1",
		crossPaths := false,
		autoScalaLibrary := false,
		
		libraryDependencies ++= Seq(
		
			"com.orbitz.consul" % "consul-client" % "1.3.0"
		
		),
		
		dockerBaseImage := "myjava"
	)



