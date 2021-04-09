

name := "samplescala"

version := "1.4.9"

scalaVersion := "2.12.5"

lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging)

//rename zip file created from `dist` command
packageName in Universal := "samplescala"
