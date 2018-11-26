addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.1.0")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.4.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.0.0")
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.5.0")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.4.2")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-dependencies" % "26-c0c675cf")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2+10-148ba0ff") // pre-release in 2m repository
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "0.14")
addSbtPlugin("com.lightbend" % "sbt-whitesource" % "0.1.13")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.2")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
// latest version with https://github.com/ehsanyou/sbt-docker-compose/pull/10
addSbtPlugin("com.github.ehsanyou" % "sbt-docker-compose" % "67284e73-envvars-2m")
resolvers += Resolver.bintrayIvyRepo("2m", "sbt-plugins")
