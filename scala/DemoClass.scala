/**
  * Created by rohabhos on 3/28/2019.
  */
object DemoClass extends App{
  val data = List(1,2,3)

  /**
    * Diff to take sum
    */
  println(data.sum)
  println(Math.pow(5,4))
  var cnt = 0
  data.foreach(x=> cnt += x)
  //println(cnt)
  (Range(0,5).foreach(println))
  println("fold = " +data.foldLeft(-1)(_+_))
}
