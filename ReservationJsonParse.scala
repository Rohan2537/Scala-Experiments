import java.io.{FileWriter, BufferedWriter}
import java.util.ArrayList

import au.com.bytecode.opencsv.CSVWriter
import net.liftweb.json.{JsonParser, DefaultFormats}

import scala.io.Source

/**
  * Created by rohabhos on 3/27/2019.
  */
object ReservationJsonParse extends App{
  implicit val formats = DefaultFormats

  val jsonString = Source.fromFile("C:/Scala/Scala exercise/reservation.json").mkString
 // println(jsonString)

  val json = JsonParser.parse(jsonString)//parse(jsonString)
  val elements = (json \\ "Reservations").children

  val out = new BufferedWriter(new FileWriter("C:/Scala/Scala exercise/reservation.csv"));
  val writer = new CSVWriter(out);
  val reservationHeadings = Array("Name","Platform","Current_Reservation","Required_Reservation","Instance_Id")

  var newListOfRecords = new  ArrayList[Array[String]]
  newListOfRecords.add(reservationHeadings)
 // def g(v:Map[String, String]) = "("+v.get("Key").get+","+v.get("Value").get+")"
  def g(v:Map[String, String]) = v.get("Key").get+"->"+v.get("Value").get //Map(v.get("Key"), v.get("Value"))//v.get("Key")//Map("a", "v") //Map(v.get("Key"), v.get("Value"))
  //+ v.get("Value")

  for (acct <- elements) {
    val m = acct.extract[Reservations]
    //m.Instances(0).Tags.foreach(println)
    for(ins <- m.Instances) {
      //println("Hi")
      //ins.Tags(0).foreach(println)
      //val a = ins.Tags.filter({ case(key, value) => "a".equals("a") })
        //flatMap(x=>x.get("Value"))
      //a(0).filter(a==a)

      val b = ins.Tags.map(x => g(x))
//println(b)

     // val xs = ins.Tags.flatMap((x,y)=> (x.get("Key"), y => y.get("Value")))//List((1,2)->3,(4,5)->6,(7,8)->9)
     // xs map { case (a,b) => (a.swap, b) }
       // println("a "+xs)
      val ys = ins.Tags.flatMap((x:Map[String, String])=> x.get("Value"))
      println(ys)
      //val ys = ins.Tags.flatMap(x => x.get("Value"))
     // println("b "+ys)
      //val list = Array(s"${ins.Tags}",s"${ins.InstanceId}")
      //newListOfRecords.add(list)
    }
  }
  writer.writeAll(newListOfRecords)
  out.close()
}
