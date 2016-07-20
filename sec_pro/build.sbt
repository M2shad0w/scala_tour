lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "SetMeal"
  )

lazy val commonSettings = Seq(
  organization := "com.HunLiJi.com",
  version := "1.2.0",
  scalaVersion := "2.10.6"
)