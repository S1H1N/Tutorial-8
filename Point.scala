case class Point(var x: Int, var y: Int) {
  def add(a:Point) =  Point(this.x + a.x, this.y + a.y)

  def move(x:Int, y:Int):Unit = {
    this.x = this.x + x
    this.y = this.y + y
  }

  def distance(a:Point) : Double = {
    var xDis:Int = this.x - a.x
    var yDis:Int = this.y - a.y
    var totaldis: Int = xDis*xDis + yDis*yDis
    scala.math.sqrt(totaldis)
  }

  def invert() :Unit = {
    var a = this.x
    this.x = this.y
    this.y = a
  }

}

object Point extends App {

  var a = Point(1,2)
  var b = Point(4,10)

  println("Addition -->"+a.add(b))

  a.move(x = 2, y = 4)
  println("Movement -->"+a)

  var c = a.distance(b)
  println("Distance -->"+c)

  a.invert()
  println("Invert -->"+a)
}