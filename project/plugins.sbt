resolvers ++= Seq(
  Resolver.url("hmrc-sbt-plugin-releases", url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(Resolver.ivyStylePatterns),
  Resolver.jcenterRepo,
  Resolver.typesafeRepo("releases")
)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "1.6.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-git-versioning" % "0.9.0")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.16")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")