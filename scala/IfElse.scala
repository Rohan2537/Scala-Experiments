/**
  * Created by rohabhos on 3/29/2019.
  */
object IfElse extends App{
  val  x = 20
  var res = ""
  if(x<=20) res= "x==20"
  else res = "x!=20"

  println(res)
  println(if(x!=20) "x!=20" else "x==20")
}
