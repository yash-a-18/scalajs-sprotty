val scala3Version = "3.5.2"  // Use your desired Scala 3 version

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    name := "experiment",  // Set your project name
    version := "0.1.0-SNAPSHOT",  // Set your project version
    scalaVersion := scala3Version,  // Use Scala 3 version
    scalaJSUseMainModuleInitializer := true,  // Use the main module initializer
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),  // Use Node.js with jsdom for testing
    // Scala.js specific libraries
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0",  // Add Scala.js DOM dependency

    // NPM dependencies for bundling
    Compile / npmDependencies ++= Seq(
      "rimraf" -> "5.0.10",
      "sprotty" -> "1.3.0",
      "sprotty-vscode-protocol" -> "1.0.0",
      "sprotty-protocol"-> "1.3.0",
      "sprotty-vscode-webview" -> "1.0.0",
      "glob" -> "10.4.5",
      "uuid" -> "11.0.2",
      "reflect-metadata" -> "0.2.2",
      "inversify" -> "6.0.1"
    ),

    // Laminar for frontend UI (if you plan to use it)
    libraryDependencies += "com.raquo" %%% "laminar" % "17.0.0",

    // Testing library (ScalaTest)
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
