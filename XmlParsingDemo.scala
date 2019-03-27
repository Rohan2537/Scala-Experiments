/**
  * Created by rohabhos on 26-03-2019.
  */
package XmlParsing

import java.io.{FileWriter, BufferedWriter}
import java.util.ArrayList

import au.com.bytecode.opencsv.CSVWriter

import scala.io.Codec
import scala.math.BigInt
import scala.xml.XML
import java.io.File

object XmlParsingDemo extends App {

  val dir = new File("C:/Scala/Scala exercise/1.43TTF")

  def getRecursiveListOfFiles(dir: File): Array[File] = {
    val these = dir.listFiles
    these ++ these.filter(_.isDirectory).flatMap(getRecursiveListOfFiles)
  }

  val listOfFileNames =  getRecursiveListOfFiles(dir)
  val fileName = listOfFileNames(0).getName
  val values = fileName.split("_")
  val  effectiveTension = values(1)+"_"+ values(2) +"_" +  values(3)
  val ttf = values(1).replace("TTF","")
  val tilt = values(3).replace("T","")
  val direction = values(2).replace("d","")

  val xmlData = XML.loadFile(listOfFileNames(0))
  val x = xmlData \\ "Plot2" \\"Set" \\ "PlotPoint" \\"@X"
  val y = xmlData \\ "Plot2" \\"Set" \\ "PlotPoint" \\"@Y"
  val effect = x.map(x => x.toString.replace(" ",""))
  val effLength = y.map(x => x.toString.replace(" ",""))
  val element = xmlData \\ "Plot2" \\"Set" \\ "PlotPoint" \\"@Tool"
  val setName = element.flatMap(e => e.toString().split(":").drop(1))
  val elementId = element.flatMap(e => e.toString.split(",").dropRight(1).map(f=>f.toString.replace(" Element ","")))

  val position = element.flatMap(e => e.toString.split("[,:]").drop(1).take(1)).map(
    g=>g.toString.replace("Element Set","").trim.replaceAll(" +", " "))

  val out = new BufferedWriter(new FileWriter("C:/Scala/Scala exercise/"+effectiveTension+".csv"));
  val writer = new CSVWriter(out);

  val reservationHeadings = Array("TTF","Tilt","Direction","ElementId","SetName","Position","Effective Tension","Length")

  var newListOfRecords = new  ArrayList[Array[String]]
  newListOfRecords.add(reservationHeadings)

  for (ele <- 0 to setName.length-1) {
      val list = Array(ttf,tilt,direction,elementId(ele),setName(ele),position(ele), effect(ele).toString, effLength(ele).toString)
      newListOfRecords.add(list)
  }
  writer.writeAll(newListOfRecords)
  out.close()



  for(i<-0 to 5 ; j<- 0 to 3)println(i,j)
}
