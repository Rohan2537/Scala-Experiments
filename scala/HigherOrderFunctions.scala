/**
  * Created by rohabhos on 3/29/2019.
  */
object HigherOrderFunctions extends App{
  def math(x:Double,y:Double, fun:(Double,Double)=>Double): Double = fun(x,y)
  val result = math(50,20,(a,b)=>a*b)
  println(result)

  def newMath(x:Double,y:Double,z:Double, fun:(Double,Double)=>Double):Double = fun(fun(x,y),z)
  //val newResult = newMath(10,20,30,(x,y)=>x max y)
  val newResult = newMath(10,15,20,_ max _)
  println(newResult)
}
