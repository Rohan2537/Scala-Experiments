/*
/**
  * Created by rohabhos on 22-03-2019.
  */

import net.liftweb.json.DefaultFormats
import net.liftweb.json._

import scala.io.Source

case class Instances(
          PublicDnsName: String,
          EbsOptimized: Boolean,
          LaunchTime: String,
          ProductCodes: List[String],
          State: StateClass
  )
case class StateClass(
              Code: Int,
              Name: String
            )
object JsonParsingForReservation extends App{
  implicit val formats = DefaultFormats

  // a JSON string that represents a list of EmailAccount instances
  val jsonString = Source.fromFile("C:/Users/rohabhos/Desktop/reserved.json").mkString
  // json is a JValue instance
  val json = parse(jsonString)


  val elements = (json \\ "Instances").children

  for (acct <- elements) {
    // println(acct)
    val m = acct.extract[Instances]
    //println("a "+m)
    println(s"${m.State.Code}")
    println(s"Account: ${m.PublicDnsName}, ${m.EbsOptimized}, ${m.LaunchTime}")
    println(" Users: " + m.ProductCodes.mkString(","))
  }
}




*/
