ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "udemy-scala-streams"
  )

val akkaVersion = "2.6.20"
val scalaTestVersion = "3.2.18"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion
  //"org.slf4j" % "slf4j-api" % "1.7.32",  // SLF4J
  //"ch.qos.logback" % "logback-classic" % "1.2.6"  // SLF4J imp Logback
)