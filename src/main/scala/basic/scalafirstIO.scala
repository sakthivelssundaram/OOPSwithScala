package basic

import scala.io.StdIn._

object scalafirstIO {
  def main(args: Array[String]) ={
    println("what is your name")
    val name  = readLine()
    println("whats your age")
    val age = readInt()
    println(s"Hi $name, How are you? Do you know you are $age years old!!!")
  }
}
