ThisBuild / scalaVersion := "2.13.0"
ThisBuild / organization := "io.rob"

lazy val hello = (project in file("."))
  .settings(
    name := "Kinesis Test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
