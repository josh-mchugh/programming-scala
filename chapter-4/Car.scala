//In Java we explicity defined the field and method for the property year and wrote an explicit constructor. Scala, the parameter took care of defining that field and writing the accessor method. Scala accomplishes the same thing wih more concise code.
class Car(val year: Int) {
  private var milesDriven: Int = 0

  def miles() = milesDriven

  def drive(distance: Int) {
    milesDriven += Math.abs(distance)
  }
}

val car = new Car(2009)
println("Car made in year " + car.year)
println("Miles driven " + car.miles)
println("Drive for 10 miles")
car.drive(10)
println("Miles driven " + car.miles)
