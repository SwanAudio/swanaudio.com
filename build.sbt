name := "swanaudio"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "3.1.0",
  "org.webjars" % "angularjs" % "1.3.0-beta.2"
)

play.Project.playScalaSettings
