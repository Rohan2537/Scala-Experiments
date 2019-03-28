/**
  * Created by rohabhos on 3/28/2019.
  */
import util.control.Breaks._

object Test extends App{
  val a = Array(1.0,2.0,3.0,4.0,5.0)
  //println(a.reduce(_ + _))

  val divide = (x: Double, y: Double) => {
    val result = x / y
    println(s"divided $x by $y to yield $result")
    result
  }
  //println(a.reduceLeft(divide)) //0.008333333333333333
  //println(a.reduceRight(divide)) //1.833333
  //println(a.reduce(divide)) //0.008333333333333333
  //println(a.fold(2.5)(divide)) //0.020833333333333336
  //println(a.scanLeft(2.5)(divide))
  //println(a.foldRight(2.5)(divide)) //0.75
  // println(a.foldLeft(2.5)(divide)) //0.020833333333333336

  val product = (x: Int, y: Int) => {
    val result = x * y
    println(s"multiplied $x by $y to yield $result")
    result
  }

  val b = Array(1, 2, 3)
  //b.scanLeft(10)(product)
  //b.scanRight(10)(product)
  //b.scan(10)(product)
  //b.foldLeft(10)(product)
  //b.reduceLeft(product)
  val bag = List(1,2,3,4,"7")

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: Exception => None
    }
  }
  //println(bag.flatten)
  //println(bag.map(toInt).flatten.sum)
  //val aa=bag.flatMap(x=> if(x<4) List(x*6) else None)
  //val aa=bag.flatMap(x=> if(x<4) List(x*6,x+1) else None)
  //val aa=bag.map(x=> x*6)
  val aa=bag.map(x=>x.toString())//map(y=>y))
  //println(aa)
  def subWords(word: String) = List(word, word.head, word.tail, word.take(word.length-1))
 // println(subWords("then"))
  val words = List("band", "start", "then")
  //val newList = List(List("band", "b", "and", "ban"), List("start", "s", "tart", "star"), List("then", "t", "hen", "the"))
 // val newList = List(List(1,2,3), List(4,5,6), List(7,8,9))
  //println(words.map(subWords))
  //println(newList.flatten)
  //println(words.map(subWords).flatten)//flatten and map can be used seperatly or together
  ////println(words.flatMap(subWords)) //It is a combination of flatten and map

  println("\n=== BREAK EXAMPLE ===")
  breakable {
    for (i <- 1 to 10) {
      //println(i)
      if (i > 4) break  // break out of the for loop
    }
  }

  //println("\n=== CONTINUE EXAMPLE ===")
  val searchMe = "peter piper picked a peck of pickled peppers"
  var numPs = 0
  for (i <- 0 until searchMe.length) {
    breakable {
      if (searchMe.charAt(i) != 'p') {
        break  // break out of the 'breakable', continue the outside loop
      } else {
        numPs += 1
      }
    }
  }
  //println("Found " + numPs + " p's in the string.")

  val m1 = Map("fname" -> "Al", "lname" -> "Alexander")
  for ((k,v) <- m1) printf("key: %s, value: %s\n", k, v)
}
