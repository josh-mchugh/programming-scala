//Scala can also define other fields, methods, and auxiliary constructors. In this example, the primary constructor takes two parameters. The auziliary constructor takes three parameters. The first call within an auxiliary constructor is required to call the primary constructor or another auxilary constructor. Scala treats field specially, any var defined within in a class is mapped to private and has corresponding accessor methods. 
class Person(val firstName: String, val lastName: String) {
  private var position: String = _

  println("Creating " + toString())

  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }

  override def toString() : String = {
    firstName + " " + lastName + " holds " + position + " position "
  }
}

val john = new Person("John", "Smith", "Analyst")
println(john)
val bill = new Person("Bill", "Walker")
println(bill)
