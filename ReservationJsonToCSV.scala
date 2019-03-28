/**
  * Created by rohabhos on 26-03-2019.
  */

import java.util
import java.util.ArrayList
import java.io.StringWriter
import au.com.bytecode.opencsv.CSVWriter
import scala.collection.JavaConversions._
import java.io.FileWriter
import java.io.BufferedWriter
import net.liftweb.json.DefaultFormats
import net.liftweb.json._
import scala.io.Source
import scala.collection.mutable.ListBuffer

case class Reservations(Instances: List[Instances])
case class Instances(
                      InstanceId: String,
                      PublicDnsName: String,
                      ProductCodes: List[String],
                      Tags: List[Map[String, String]],
                      State: StateClass
                    )

case class StateClass(Code: Int, Name: String)

object ReservationJsonToCSV extends App{

  implicit val formats = DefaultFormats

  val jsonString = Source.fromFile("C:/Scala/Scala exercise/reservation.json").mkString
 //println(jsonString)

  val json = JsonParser.parse(jsonString)//parse(jsonString)
  val elements = (json \\ "Reservations").children

  val out = new BufferedWriter(new FileWriter("C:/Scala/Scala exercise/reservation.csv"));
  val writer = new CSVWriter(out);
  val reservationHeadings = Array("code","DNS Name")

  var newListOfRecords = new  ArrayList[Array[String]]
  newListOfRecords.add(reservationHeadings)

  for (acct <- elements) {
    //println("aa"+acct.extract[Reservations])
    val m = acct.extract[Reservations]
   // println("size of reser ")

    for(ins <- m.Instances) {
      println("count")
      val list = Array(s"${ins.State.Code}", s"${ins.PublicDnsName}")
      newListOfRecords.add(list)
    }
  }
  writer.writeAll(newListOfRecords)
  out.close()
}