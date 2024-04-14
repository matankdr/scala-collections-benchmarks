ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.16"

lazy val root = (project in file("."))
  .settings(
    name := "scala-collections-benchmarks"
  )


scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xlint", "-Xdisable-assertions")

enablePlugins(JmhPlugin)