name := "swanaudio"

version := "1.0-SNAPSHOT"

incOptions := incOptions.value.withNameHashing(true)
updateOptions := updateOptions.value.withCachedResolution(cachedResoluton = true)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val ngVersion = "2.4.7"
  val circeVersion = "0.8.0"

  Seq(
    ws,
    cache,
    filters,
    guice,

    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion,

    // Angular 2 framework
    "org.webjars.npm" % "angular__common" % ngVersion,
    "org.webjars.npm" % "angular__compiler" % ngVersion,
    "org.webjars.npm" % "angular__core" % ngVersion,
    "org.webjars.npm" % "angular__http" % ngVersion,
    "org.webjars.npm" % "angular__forms" % ngVersion,
    "org.webjars.npm" % "angular__router" % "3.4.4",
    "org.webjars.npm" % "angular__platform-browser-dynamic" % ngVersion,
    "org.webjars.npm" % "angular__platform-browser" % ngVersion,
    "org.webjars.npm" % "rxjs" % "5.0.1",
    "org.webjars.npm" % "zone.js" % "0.8.1",
    "org.webjars.npm" % "core-js" % "2.4.1",

    // SystemJS
    "org.webjars.npm" % "systemjs" % "0.19.40",

    // Typescript
    "org.webjars.npm" % "typescript" % "2.4.1",
    "org.webjars.npm" % "tslint-eslint-rules" % "3.4.0",
    "org.webjars.npm" % "tslint-microsoft-contrib" % "4.0.0",

    // Libraries
    "org.webjars.npm" % "angulartics2" % "1.6.3",

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
