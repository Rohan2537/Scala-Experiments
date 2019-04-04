import org.apache.spark.{SparkConf, SparkContext}

import scala.util.Random

/**
  * Created by rohabhos on 4/4/2019.
  */
object NumberCount extends App{
  val inputList = List(1,2,3,2,3,2,4,3,4,2,6)
  val mappedList = inputList.map(x=>(x,1))
/*

  1,1  2,1  3,1   2,1


 */
  val keyGroup = mappedList.groupBy(_._1)
  val  valueGroup = keyGroup.mapValues(_.map(_._2).size)

  println(keyGroup)
  println("Value Group:  "+valueGroup)

  //println(mv.mapValues(x=>x.size))

  val conf = new SparkConf().setAppName("NumberCount").setMaster("local[*]")
  val sc = new SparkContext(conf)

  val rdd1 = sc.parallelize(List(1,4))
  //rdd1.collect()
  println(rdd1.collect())
  Thread.sleep(500000)
}
