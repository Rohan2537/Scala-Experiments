/**
  * Created by rohabhos on 3/29/2019.
  */
object CurryingFunction extends App{
  def add(x:Int,y:Int) = x+y
  def add2(x:Int)=(y:Int)=>x+y  //1st way
  println(add(20,10))
  println(add2(20)(10))
  val sum = add2(40)
  println(sum(100))

  def add3(x:Int)(y:Int) = x+y    //2nd way
  println(add3(100)(200))

  val sumOne = add3(50)_
  //println(sumOne)
  println(sumOne(30))
}
