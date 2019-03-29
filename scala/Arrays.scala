/**
  * Created by rohabhos on 3/29/2019.
  */
object Arrays extends App{
  val myarray:Array[Int]= new Array[Int](4)
  val myarray2 = new Array[Int](5)
  myarray(0)= 10
  myarray(1)= 20
  myarray(2)= 30
  myarray(3)= 40
  println(myarray.toList)
  for (x<-0 to myarray.length-1){
    println(x)
    println(myarray(x))
  }
  myarray.foreach(println)
}
