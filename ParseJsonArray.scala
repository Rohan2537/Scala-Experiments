/**
  * Created by rohabhos on 22-03-2019.
  */

import net.liftweb.json.DefaultFormats
import net.liftweb.json._

import scala.io.Source

case class EmailAccount(
             accountName: String,
             url: String,
             username: String,
             password: String,
             minutesBetweenChecks: Int,
             usersOfInterest: List[String]
                       )


object ParseJsonArray extends App{
  implicit val formats = DefaultFormats

  // a JSON string that represents a list of EmailAccount instances
  val jsonString = Source.fromFile("C:/Users/rohabhos/Desktop/Example.json").mkString
  // json is a JValue instance
  val json = parse(jsonString)

  val elements = (json \\ "emailAccount").children
  for (acct <- elements) {
    val m = acct.extract[EmailAccount]
    println(s"Account: ${m.url}, ${m.username}, ${m.password}")
    println(" Users: " + m.usersOfInterest.mkString(","))
  }
}