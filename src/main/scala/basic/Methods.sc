val num = List(6,34,3,1,2,3,6,7,83,5)
val names = Array("sakthi","Guna","Mohan")
val c = num.patch(3,List(34,45),2)


println("drop @ index :" + num.drop(2))
println("drop @ index from last :" + num.dropRight(3))
println("head of a List :"+num.head)
println("element of a list except head  :"+num.tail)
println("last element of a list :"+num.last)

val num2 =num.dropWhile(_ % 2 == 0)
num2

def sumofList(lst: List[Int]): Int = lst match {
  case Nil => 0
  case h::t => {
    println(sumofList(t))
    1 + sumofList(t)
  }
}

val c = sumofList(1::3::Nil)
print(c)

val e = 1 to 4
print(e)

val souce = io.Source.fromFile("/home/sakthivel/Documents/apple.txt")
val source3 = souce.getLines.map(line => line).toArray
source3.foreach(println)
souce.close()

val cc = "apple".capitalize
print(cc)

apple.