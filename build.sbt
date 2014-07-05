name := "swanaudio"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-RC1-1",
  "org.webjars" % "bootstrap" % "3.1.0",
  "org.webjars" % "angularjs" % "1.3.0-beta.2"
)

com.jamesward.play.BrowserNotifierPlugin.livereload
