import sun.security.tools.PathList

name := "spark-steraming-with-delltalake"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.4"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.4" % "provided"
libraryDependencies += "io.delta" %% "delta-core" % "0.6.0"

//configuration file dependency
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
libraryDependencies += "com.typesafe" % "config" % "1.2.1"

// Reading data from s3 SBT dependency
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "2.7.4"


