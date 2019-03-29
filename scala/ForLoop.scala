/**
  * Created by rohabhos on 3/29/2019.
  */
object ForLoop extends App{
val vector = for (i<- 1 to 5) yield (i)
 // println("Vector is: " +vector)
  //vector.map(y=>y*5).foreach(println)
 // println(vector.map(y=>y*5))
//  println(vector.sum)

  // for (i<-1 to 5) println(i)
  // for(i<- 1.to(5)) println(i)
  // for (i<-1 until  5) println(i)
  // for (i<-5 to 1 by(-1)) println(i) //Reverse for loop
  // for (i<-1 to 5;j<- 1 to 5) println(i,j) //nested for loops

  val list = List("R","O","H","A","N")
  for(i<- list) println(i)

  val newlist = List("R","O","H","A","N")
  for(i<- list ; if (i.equals("R"))) println("R is found at "+i.indexOf("R")+"th index")
}
