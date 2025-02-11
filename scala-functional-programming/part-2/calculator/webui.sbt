lazy val webUI = project.in(file("web-ui")).
  enablePlugins(ScalaJSPlugin).
  settings(
    scalaVersion := "2.11.12",
    // Add the sources of the calculator project
    unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "src" / "main" / "scala" / "calculator",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.4",
    scalaJSUseMainModuleInitializer := true
  )
