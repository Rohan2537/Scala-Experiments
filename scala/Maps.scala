/**
  * Created by rohabhos on 3/29/2019.
  */
object Maps extends App{
  val myMap: Map[Int,String] = Map(100-> "Max",101->"Tom",102->"John")
  println(myMap)
  println(myMap.getOrElse(90,"Key is not present !!!"))
  println(myMap(100))
  println(myMap.keys)
  println(myMap.keySet)
  println(myMap.values)
  println(myMap.isEmpty)
}
