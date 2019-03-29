/**
  * Created by rohabhos on 3/29/2019.
  */
object MapAndFilter extends App {
  val list = List(1,2,3,4,5,6)
  val myMap = Map(1->"R",2->"O",3->"H",4->"A",5->"N")
  println(myMap)
  println(list.map(x => x/0.2))
  println(list.map(x => "Hi"* x))
  println(myMap.mapValues(x => "Hi" + x))
  println(List(List(1,2,3),List(4,5,6)).flatten) //flatMap -> cokmbination of map and flatten
  println(list.filter(x => x%2==0))
}
