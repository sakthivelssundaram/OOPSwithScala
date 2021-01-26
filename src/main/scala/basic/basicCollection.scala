package basic

import scala.io.StdIn.readInt

object basicCollection {
  def main(args : Array[String]) = {
    //Array:
    //these are collections that are fixed in length and are mutable
    //preprend and append are not efficient.
    //declearing a ARRAY & LIST

    val num = Array(1,2,4,5,76,8)
    val words = List("One","Two","four","five","seventysix","eight")

    num.foreach(println)


    //filling the list and arry with fill
    //fill is a function that takes 2 parameters, 1 the single int that denotes how many elements are
    //to be present in the list/array

    //fill parameter 2 is the finction that is used to populate the list

    val list2 = List.fill(10)(9)
    val array2 = Array.fill(20)("a")
    val listRand = List.fill(100)(math.random())
    //val array22 = Array.fill(20)(i => i+1)
    //array22.foreach(println)


    //val array223 = Array.fill(20)(readInt())
    //array223.foreach(println)
    /*
    Note: the fill function takes 2 parameters
    1.  Currying : this is a methos where the parameters of a function are sent in input segments
    fill(10)("logic to the function")

    2. the second parameter is passed-by-name:
    i.e, the logic is sent to the function as it is, before being evaluated, this caused
    the logic to be evaluated every time the function is called, unlike pass-by-value: which is the default
    in Scala. where the value is evaluated before passing it to the function.
     */


    /*

    TABULATE
     */

    val count = Array.tabulate(100)(i => i+1)
    val fizzBuzz = List.tabulate(100)(i => ((i+1) % 3, (i+1) % 5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => (i+1).toString
    })

    val fizzBuzzC = List.tabulate(100)(index => {
      val i = index+1
      (i % 3, i % 5) match {
        case (0, 0) => "fizzbuzz"
        case (0, _) => "fizz"
        case (_, 0) => "buzz"
        case _ => i.toString
      }})

    def readPositive():List[Int] = {
      val i = readInt()
      if(i < 0) Nil
      else i :: readPositive()
    }
    val PPLE  = readPositive()
    PPLE.foreach(println)

    /*
    1.7.2.7 Methods
     */

  }
}
