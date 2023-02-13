name := "lenet-assignment"

version := "0.1"

scalaVersion := "2.12.7"

resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += Resolver.sonatypeRepo("releases")

val paradise_version  = "2.1.0"
/** Macro Paradise **/

addCompilerPlugin("org.scalamacros" % "paradise" % paradise_version cross CrossVersion.full)

val scalatestVersion  = "3.0.5"


libraryDependencies ++= Seq(
  "edu.stanford.cs.dawn" %% "spatial" % "1.1-cs217",
  "org.scalatest" %% "scalatest" % scalatestVersion
)
