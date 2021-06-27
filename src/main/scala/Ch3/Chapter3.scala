package Ch3

class Vecr_2D_a(val x: Double, val y: Double) {
  def plus(v: Vecr_2D_a) = new Vecr_2D_a(x+v.x, y+v.y)
  def minus(v: Vecr_2D_a) = new Vecr_2D_a(x-v.x, y-v.y)
  def scale(c: Double) = new Vecr_2D_a(x*c, y*c)
  def magnitude = math.sqrt(x*x + y*y)
 }

object Vecr_2D_a {
  def main(args: Array[String]) = {
    val v1 = new Vecr_2D_a(1,2)
    val v2 = new Vecr_2D_a(2,2)
    val v3 = v1.plus(v2)
    println(v3.magnitude)
  }
}

//mutable Version
class Vecr_2D_a_Mutable(private var _x: Double, private var _y: Double) {
  def x = _x
  def y = _y
  def setX(newX:Double) = _x = newX
  def setY(newY:Double) = _y = newY
  def plus(v: Vecr_2D_a_Mutable) = {
    _x += v.x
    _y += v.y
    this
  }
  def minus(v: Vecr_2D_a_Mutable) = {
    _x -= v.x
    _y -= v.y
    this
  }
  def scale(c: Double) = {
    _x *= c
    _y *= c
    this
  }
  def magnitude = math.sqrt(x*x + y*y)
}