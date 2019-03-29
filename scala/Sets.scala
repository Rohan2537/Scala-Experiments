/**
  * Created by rohabhos on 3/29/2019.
  */
object Sets extends App{
  val mySet: Set[Int] = Set(1,2,3,4,5,6)
  val mySetOne: Set[Int] = Set(4,5,6,7,8,9,10)
  val names: Set[String] = Set("Max","Tom","John")
  //println(mySet+10)
  //println(names("Maxxxx"))  //checks if that particular element is present or not?
 // println(mySet.head)
  //println(mySet.tail)
 // println(mySet.isEmpty)
 // println(mySet ++ mySetOne)
 // println(mySet.++(mySetOne))
  println(mySet.&(mySetOne))  //finds the common element present in both the sets
  println(mySet.intersect(mySetOne))  //finds the common intersecting point i.e element present in both the sets
  println(mySet.max)
  println(mySet.min)
  mySet.foreach(println)

  for(name<- names) println(name)
}
