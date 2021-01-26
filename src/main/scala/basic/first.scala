package basic

object first {
  def main(args: Array[String]) = {

    /*
    Variables
     */

    val value = "sakthivel scala"
    val age = 27
    var lastName = "Somasundaram"
    val t = (1,2,"this is a string")
    val (a,b,c) = t
    println("a: "+a)
    println("b: "+b)
    println("t: "+ t._1)


    /*
    String Interpolation in scala
     */


    val messsage  = "this is a message and the value of value variable is " + value
    val message2 = s"this is a staing and the value of the value is  $value"
    val message3 = s"this is  a string and the third value in the tuple is ${t._3}"
    println(message2)
    println(messsage)
    println(message3)

    print("please complete this course da sakthi")
  }
}
