//Extending classes in Scala is similar to Java expect for two restrictions: method overriding requires the 'override' keyword and only the primary constructor can pass parameters to the base constructor. Scala avoid override methods by acciedent by requiring the keyword. Auxiliary constructors have to call either the primary constructor or another auxiliary constructor.
class Vehicle(val id: Int, val year: Int) {
  override def toString(): String = "ID: " + id + " Year: " + year
}

class Car(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id, year) {
  override def toString(): String = super.toString() + " Fuel Level: " + fuelLevel
}

val car = new Car(1, 2009, 100)
println(car)
