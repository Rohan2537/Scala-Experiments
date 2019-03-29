package shubham

import scala.annotation.tailrec

/**
  * Created by rohabhos on 3/29/2019.
  */
object TailRecPrimeOrNot extends App{

  def primeOrNot(value:Int) :Boolean = {
  @tailrec
    def primeChecker(count:Int, accumulator :Boolean):Boolean = {
      if(count >=value || accumulator == false) accumulator
      else primeChecker(count+1, value%count != 0)}
    primeChecker(1,true)
  }
  println(primeOrNot(32))
}
