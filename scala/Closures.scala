/**
  * Created by rohabhos on 3/29/2019.
  */
object Closures extends App{
  var input = 10
  val add = (x:Int)=>x+input
  println(add(20))

  val sum = (x:Int) => {
    input = x + 10
    input
  }
  println(sum(20))
  println(input)
}
