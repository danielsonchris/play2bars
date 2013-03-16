import sbt._
import Keys._
import play.Project
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play2bars-java-ebean"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "postgresql" % "postgresql" % "9.0-801.jdbc3",
      javaCore,
      javaJdbc,
      javaEbean
    )

    val main = Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here
    )

}
