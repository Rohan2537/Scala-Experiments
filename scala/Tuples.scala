/**
  * Created by rohabhos on 3/29/2019.
  */
object Tuples extends App{
  val myTuple = (1,2,"hello",true)
  val myTupleOne = new Triple(1,2,"hello")
  val myTupleTwo = new Triple(1,"hello",(2,3))
  println(myTuple._1)
  println(myTuple._2)
  println(myTuple._3)
  println(myTuple._4)
  println(myTupleTwo._3)

  myTuple.productIterator.foreach{
    i=> println(i)
  }
  println(1-> "Tom"-> true)
  println(myTupleTwo._3._2)
}
