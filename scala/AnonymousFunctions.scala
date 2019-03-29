/**
  * Created by rohabhos on 3/29/2019.
  */
object AnonymousFunctions extends App {
  val my: Double =6
    println(my)

    def test : String = {
      println("Hello ")
      "Hello"
    }

  val anon = (a:Int,b:Int)=> a+b  //anonymous function 1st way
  println(anon(10,10))

  val anonymous:(Int,Int)=>Int =(a:Int,b:Int)=>a+b    //2nd way
  println(anonymous(20,30))

  val anonymousFunction = {(a:Int) => a*a}    //curly braces with lambda
  println(anonymousFunction(20))

  val anonymousFun:(Int,Int)=>Int =(a,b)=>a+b    //4th way
  println(anonymousFun(20,30))

  //test("World!!!")

}
