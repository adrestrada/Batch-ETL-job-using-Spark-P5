name := "spark_project5"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.4.4"

//libraryDependencies ++= Seq (
//  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
//  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
//  "org.apache.spark" %% "spark-streaming" % "2.3.3",
//  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.3"
//)
libraryDependencies += "org.apache.spark" %% "spark-core"                 % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql"                  % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-streaming"            % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion

resolvers += "Cloudera" at "http://repository.cloudera.com/artifactory/cloudera-repos/"