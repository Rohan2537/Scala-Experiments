package MacclaureinSeries

/**
  * Created by rohabhos on 3/28/2019.
  */
object MacSeries extends App{

  def calMac(input: Float, power: Float):Float={
      if (power == 0) 1
      else division(multiplier(input, power), factorial(power)) + calMac(input, power - 1)
  }

  def factorial(input: Float):Float={
    if(input<=1) 1
    else input*(factorial(input-1))
  }
  def multiplier(input: Float,power:Float):Float={
    if(input<=1) input
    else
      if(power==0) 1
      else input*multiplier(input, power-1)
  }
  val result = (Range(0,5).map(x=>{
    //println(x)
    Math.pow(4,x)/ factorial(x)

  }).foldRight(0.0)(_ + _))

  def division(multiplier: Float,factorial:Float):Float={
    multiplier/factorial
  }
  println(result)
}
