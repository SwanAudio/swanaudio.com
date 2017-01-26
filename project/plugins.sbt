// Comment to get more information during initialization
logLevel := Level.Debug

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.10")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

// Typescript
addSbtPlugin("name.de-vries" % "sbt-tslint" % "4.0.2-1")

addSbtPlugin("name.de-vries" % "sbt-typescript" % "0.3.0-beta.8")

// Stylus
addSbtPlugin("com.typesafe.sbt" % "sbt-stylus" % "1.0.0")
