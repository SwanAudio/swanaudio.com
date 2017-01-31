name := "swanaudio"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val ngVersion = "2.4.4"

  Seq(
    ws,
    cache,
    filters,

    "org.webjars.npm" % "angular__common" % ngVersion,
    "org.webjars.npm" % "angular__compiler" % ngVersion,
    "org.webjars.npm" % "angular__core" % ngVersion,
    "org.webjars.npm" % "angular__http" % ngVersion,
    "org.webjars.npm" % "angular__forms" % ngVersion,
    "org.webjars.npm" % "angular__router" % "3.4.4",
    "org.webjars.npm" % "angular__platform-browser-dynamic" % ngVersion,
    "org.webjars.npm" % "angular__platform-browser" % ngVersion,
    "org.webjars.npm" % "systemjs" % "0.19.40",
    "org.webjars.npm" % "rxjs" % "5.0.0-beta.12",
    "org.webjars.npm" % "reflect-metadata" % "0.1.8",
    "org.webjars.npm" % "zone.js" % "0.6.26",
    "org.webjars.npm" % "core-js" % "2.4.1",
    "org.webjars.npm" % "symbol-observable" % "1.0.1",

    "org.webjars.npm" % "typescript" % "2.1.4",

    //tslint dependency
    "org.webjars.npm" % "tslint-eslint-rules" % "3.1.0",
    "org.webjars.npm" % "tslint-microsoft-contrib" % "2.0.12",

    // CSS
    "org.webjars.npm" % "normalize.css" % "4.2.0"
  )
}

pipelineStages := Seq(digest, gzip)

StylusKeys.compress in Assets := true
includeFilter in (Assets, StylusKeys.stylus) := "*.styl"
excludeFilter in (Assets, StylusKeys.stylus) := "_*.styl"

resolveFromWebjarsNodeModulesDir := true

(rulesDirectories in tslint) := Some(List(
  tslintEslintRulesDir.value,
  ng2LintRulesDir.value
))

logLevel in tslint := Level.Debug

routesGenerator := InjectedRoutesGenerator
