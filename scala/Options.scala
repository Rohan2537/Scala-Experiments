/**
  * Created by rohabhos on 3/29/2019.
  */
object Options extends App{
  val list = List(1,2,3)
  val map = Map(1->"R",2->"O",3->"H",4->"A",5->"N")
  val opt:Option[Int]= Some(100)
  println(list.find(_>2))
  println(map.get(1))
  println(list.find(_>2).get)
  println(map.get(1).get)
  println(map.getOrElse(6,"Key not present !!!"))
  println(opt.isEmpty)
  println(opt.get)
}
