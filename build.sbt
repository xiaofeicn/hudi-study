name := "hudi"

version := "0.1"

scalaVersion := "2.11.8"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.2.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.35"
libraryDependencies += "com.alibaba" % "fastjson" % "1.2.38"
libraryDependencies += "com.sun.jersey" % "jersey-core" % "1.9"


libraryDependencies += "com.uber.hoodie" % "hoodie-common" % "0.4.7"
libraryDependencies += "com.uber.hoodie" % "hoodie-hive" % "0.4.7"
libraryDependencies += "com.uber.hoodie" % "hoodie-spark" % "0.4.7"
libraryDependencies += "com.uber.hoodie" % "hoodie-client" % "0.4.7"
libraryDependencies += "com.uber.hoodie" % "hoodie-hadoop-mr" % "0.4.7"


libraryDependencies += "org.apache.hudi" % "hudi-common" % "0.5.0-incubating"
libraryDependencies += "org.apache.hudi" % "hudi-hive" % "0.5.0-incubating"
libraryDependencies += "org.apache.hudi" % "hudi-hadoop-mr" % "0.5.0-incubating"
libraryDependencies += "org.apache.hudi" % "hudi-spark" % "0.5.0-incubating"
libraryDependencies += "org.apache.hudi" % "hudi-client" % "0.5.0-incubating"


