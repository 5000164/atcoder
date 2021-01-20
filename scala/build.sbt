ThisBuild / organization := "jp.5000164"
ThisBuild / scalaVersion := "2.11.7"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "atcoder",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.7",
      "org.scalactic" %% "scalactic" % "3.0.7"
    ),
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint", "-target:jvm-1.8")
  )
