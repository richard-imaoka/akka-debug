lazy val root = (project in file(".")).
  settings(
    name := "akka-debug",
    version := "1.0",
    scalaVersion := "2.11.5",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.14" withSources() withJavadoc()
  )