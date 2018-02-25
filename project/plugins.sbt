// Comment to get more information during initialization
logLevel := Level.Info

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")

resolvers += Resolver.bintrayRepo("webjars","maven")

// Build
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")

// Typescript
addSbtPlugin("name.de-vries" % "sbt-typescript" % "2.5.2-1")

// Stylus
addSbtPlugin("com.typesafe.sbt" % "sbt-stylus" % "1.1.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")
