name := "s-99"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.3",
  "org.scalacheck" % "scalacheck_2.12" % "1.13.5"
)

val unusedWarnings = (
  "-Ywarn-unused" ::
    "-Ywarn-unused-import" ::
    Nil
)

scalacOptions ++= (
  "-deprecation" ::
    "-unchecked" ::
    "-Xlint" ::
    "-language:existentials" ::
    "-language:higherKinds" ::
    "-language:implicitConversions" ::
    "-Yno-adapted-args" ::
    Nil
) ::: unusedWarnings

Seq(Compile, Test).flatMap(c =>
  scalacOptions in (c, console) ~= { _.filterNot(unusedWarnings.toSet) })
