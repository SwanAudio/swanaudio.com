// Comment to get more information during initialization
logLevel := Level.Debug

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.10")

resolvers += Resolver.bintrayRepo("webjars","maven")

// Build
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0-M8")

// Typescript
addSbtPlugin("name.de-vries" % "sbt-tslint" % "4.0.2-1")

addSbtPlugin("name.de-vries" % "sbt-typescript" % "0.3.0-beta.10")

// Stylus
addSbtPlugin("com.typesafe.sbt" % "sbt-stylus" % "1.0.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")
