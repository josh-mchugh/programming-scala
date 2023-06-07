//Scala does not have static fields and methods. Allowing static fields and methods would break the fully object-oriented model that Scala supports. Scala supports class-level operations and properties. Companion objects allow us to call methods like static methods. Companion objects also have the ability to create instances of the companion class without the new keyword via the 'apply()' method.
class Marker private (val color: String) {
  override def toString(): String = "marker color " + color
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def primaryColors = "red, green, blue"

  def apply(color: String) = if (markers.contains(color)) markers(color) else null
}

println("Primary colors are: " + Marker.primaryColors)
println(Marker("blue"))
println(Marker("red"))
