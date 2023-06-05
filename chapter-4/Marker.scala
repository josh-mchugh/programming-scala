//Scala allows you to create a singleton that is connected to a class. The singleton will share the same name as a class name and is called a compainion object. The class is called a companion class. Companion classes and objects have no boundry and can access the private fields and methods of each other. 
class Marker private(val color: String) {
  println("Creating "+ this)

  override def toString(): String = "marker color " + color
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def getMarker(color: String) =
    if(markers.contains(color)) markers(color) else null
}
