name := "swanaudio"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "3.1.0",
  "org.webjars" % "backbonejs" % "1.1.2-1"
)

play.Project.playScalaSettings
