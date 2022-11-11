lazy val root = Project("scala-exercises", file(".")).settings(mainSettings: _*)

def mainSettings: Seq[Def.SettingsDefinition] = Seq(
  // some information about the "project" itself
  name := "scala-exercises",
  version := "0.10",

  // configuration telling which Scala compiler to use and some additional flags
  scalaVersion := "3.2.0",
  scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-explain"),

  // other libraries that this project depends on and their version
  libraryDependencies ++= dependencies
)

// Here we can list dependencies that we want to use.
// sbt will automatically try to download them and configure everything
// for them to be usable.
//
// We cannot only use Scala libraries, but also (most) existing
// Java libraries.
def dependencies = Seq(
  "org.scalameta" %% "munit" % "0.7.29" % Test,
   // for example, here we use a library to process json config files.
   // https://github.com/spray/spray-json
  "io.spray" %%  "spray-json" % "1.3.6",
  "org.scalactic" %% "scalactic" % "3.2.14",
  "org.scalatest" %% "scalatest" % "3.2.14" % "test",
)