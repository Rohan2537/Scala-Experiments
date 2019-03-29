/**
  * Created by rohabhos on 3/29/2019.
  */
object FoldReduceScan extends  App{
  val listOne = List(1,2,3,4,5,6,7,8)
  val listTwo = List("A ","B ","C ","D ","E")

  println(listOne.fold(0)(_+_))   //initializer is necessary in scan functions
  println(listOne.foldLeft(0)(_+_))
  println(listOne.foldRight(0)(_+_))

  println(listOne.reduce(_+_))    //Don't require initializer
  println(listOne.reduceLeft(_+_))
  println(listOne.reduceRight(_+_))

  println(listOne.scan(0)(_+_))   //initializer is necessary in scan functions
  println(listOne.scanLeft(0)(_+_))
  println(listOne.scanRight(0)(_+_))


  println(listTwo.fold("R ")(_+_))   //initializer is necessary in scan functions
  println(listTwo.foldLeft("R ")(_+_))
  println(listTwo.foldRight(" R")(_+_))

  println(listTwo.reduce(_+_))
  println(listTwo.reduceLeft(_+_))
  println(listTwo.reduceRight(_+_))

  println(listTwo.scan("Hi ")(_+_))   //initializer is necessary in scan functions
  println(listTwo.scanLeft("R ")(_+_))
  println(listTwo.scanRight(" R")(_+_))

  println(listOne.reduceLeft((x,y)=> {println(x+ " , " + y); x+y;}))
  println(listOne.reduceRight((x,y)=> {println(x+ " , " + y); x+y;}))
}
