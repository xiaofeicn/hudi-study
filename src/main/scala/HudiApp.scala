import org.apache.hudi.config.HoodieWriteConfig._
import org.apache.spark.sql.SparkSession
import org.apache.hudi.DataSourceWriteOptions._
import org.apache.spark.sql.{DataFrame, SQLContext, SaveMode}
object HudiApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .master("local")
      .appName("Demo2")
      .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .enableHiveSupport()
      .getOrCreate

    spark.sparkContext.setLogLevel("WARN")
    val jsonData = spark.read.json("D://insert.json")


    val tableName = "test_data"
    val basePath = "hdfs://cj-master:8020/study/hudi-study/hudi_data" + tableName
//    jsonData.show()
//    jsonData.write.format("org.apache.hudi")
//      .option(RECORDKEY_FIELD_OPT_KEY, "age")
//      .option(PARTITIONPATH_FIELD_OPT_KEY, "id")
//      .option(PRECOMBINE_FIELD_OPT_KEY, "name")
//      .option(TABLE_NAME, tableName)
//      .option(HIVE_SYNC_ENABLED_OPT_KEY, "true")
//      .option(HIVE_TABLE_OPT_KEY, "hivehudi")
//      .option(HIVE_PARTITION_FIELDS_OPT_KEY, "state")
//      .option(HIVE_PARTITION_EXTRACTOR_CLASS_OPT_KEY, classOf[MultiPartKeysValueExtractor].getName)
//      .mode(SaveMode.Overwrite)
//      .save(basePath)
    println(basePath)
    jsonData.write.format("org.apache.hudi")
      .option("hoodie.upsert.shuffle.parallelism", "1")
      .option(PRECOMBINE_FIELD_OPT_KEY, "age")
      .option(RECORDKEY_FIELD_OPT_KEY, "id")
      .option(PARTITIONPATH_FIELD_OPT_KEY, "name")
      .option(TABLE_NAME, tableName)
      .mode(SaveMode.Overwrite)
      .save(basePath)


  }

}
