 /**
  * Created by rohabhos on 3/29/2019.
  */
object Lists extends App{
  val myList: List[Int] = List(1,2,3,4,5,6,7,8)
  val names: List[String] = List("Max","Tom","John")
   //myList(0)=5 not allowed as list is immutable
   val newList =0::myList
   println(newList)
   println(myList)
   println(names)
   println(1::5::9::Nil)  //Nil is compulsory at last
   println(myList.head)
   println(names.tail)
   println(names.isEmpty)
   println(!names.isEmpty)
   println(myList.reverse)
   println(List.fill(3)(3)) //creates list of 3-> number of times 3-> number(input)
   println(myList.max)
   myList.foreach(println)
   var sum: Int = 0
   myList.foreach(sum += _)
   println(sum)

   for (name<- names) println(name)
}
