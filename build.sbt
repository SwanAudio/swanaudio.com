name := "swanaudio"

version := "1.0-SNAPSHOT"

incOptions := incOptions.value.withNameHashing(true)
updateOptions := updateOptions.value.withCachedResolution(cachedResoluton = true)

lazy val root = (project in file(".")).enablePlugins(PlayScala, PlayAkkaHttp2Support)

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val ngVersion = "5.1.2"
  val circeVersion = "0.8.0"

  Seq(
    ws,
    ehcache,
    filters,
    guice,

    // JSON Parsing
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion,

    // Angular 2 framework
    "org.webjars.npm" % "angular__animations" % ngVersion,
    "org.webjars.npm" % "angular__common" % ngVersion,
    "org.webjars.npm" % "angular__compiler" % ngVersion,
    "org.webjars.npm" % "angular__core" % ngVersion,
    "org.webjars.npm" % "angular__http" % ngVersion,
    "org.webjars.npm" % "angular__forms" % ngVersion,
    "org.webjars.npm" % "angular__router" % ngVersion,
    "org.webjars.npm" % "angular__platform-browser-dynamic" % ngVersion,
    "org.webjars.npm" % "angular__platform-browser" % ngVersion,
    "org.webjars.npm" % "rxjs" % "5.5.5",
    "org.webjars.npm" % "zone.js" % "0.8.16",
    "org.webjars.npm" % "core-js" % "2.4.1",

    // SystemJS
    "org.webjars.npm" % "systemjs" % "0.20.19",

    // Typescript
    "org.webjars.npm" % "typescript" % "2.6.2",

    // Libraries
    "org.webjars.npm" % "angulartics2" % "4.5.0",

    // CSS
    "org.webjars.npm" % "normalize.css" % "5.0.0"
  )
}

pipelineStages := Seq(digest, gzip)

StylusKeys.compress in Assets := true
includeFilter in (Assets, StylusKeys.stylus) := "*.styl"
excludeFilter in (Assets, StylusKeys.stylus) := "_*.styl"

resolveFromWebjarsNodeModulesDir := true
