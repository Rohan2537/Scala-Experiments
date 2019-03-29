/**
  * Created by rohabhos on 3/29/2019.
  */
object PartiallyAppliedFunctions extends App{
  val sum = (a:Int,b:Int,c:Int)=>a+b+c
  val f = sum(10,_:Int,_:Int)
  println(f(100,200))
}
