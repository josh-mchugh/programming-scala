// Scala makes it very easy to create singleton. To create a singleton you use the keyword 'object' instead of 'class'. Since you cannot instantiate a singleton object, you cannot pass parameters to the primary constructor.
class Marker(val color: String) {
  println("Creating " + this)

  override def toString(): String = "marker color " + color
}

object MarkerFactory {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def getMarker(color: String) =
    if(markers.contains(color)) markers(color) else null
}

println(MarkerFactory getMarker "blue")
println(MarkerFactory getMarker "blue")
println(MarkerFactory getMarker "red")
println(MarkerFactory getMarker "red")
println(MarkerFactory getMarker "yellow")

