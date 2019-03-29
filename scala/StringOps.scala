/**
  * Created by rohabhos on 3/29/2019.
  */
object StringOps extends  App{
  val numOne = 75
  val numTwo = 100.25
  val stringOne = "Hello"
  val stringTwo = "World !!!"

  println(stringOne.length)
  println(stringOne.concat(stringTwo))
  println(stringOne+stringTwo)

  val result = printf("(%d -- %f -- %s)",numOne,numTwo,stringOne)
  println(result)
  println("(%d -- %f -- %s)".format(numOne,numTwo,stringOne))
}
