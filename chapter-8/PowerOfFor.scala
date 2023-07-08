//Scala provides a powerful 'for' loop syntax which allows for operators, mapping, fildering, yield, and generators to be used within the iterations. It provides a clean and versitle way to iterate over iterables.

// Example of basic for loop with operators
for (i <- 1 to 3) {
  print("ho ")
}
println("")

// Example for yield
val result = for(i <- 1 to 10)
             yield i * 2
println("yield resut: " + result)

// Example of map
val result2 = (1 to 10).map(_ * 2)
println("result2: " + result2)

// Double evens
// Example of filtering
val doubleEven = for(i <- 1 to 10; if i % 2 == 0)
                 yield i * 2
println("double evens: " + doubleEven)

// Example of Generator for collecting last names
// Scala defines a new val with that name through each iteration
class Person(val firstName: String, val lastName: String)
object Person {
  def apply(firstName: String, lastName: String) : Person = new Person(firstName, lastName)
}

val friends = List(
  Person("Brain", "Sletten"),
  Person("Neal", "Ford"),
  Person("Scott", "Davis"),
  Person("Stuart", "Halloway")
)

val lastNames = for (friend <- friends; lastName = friend.lastName)
                yield lastName

println("Last names: " + lastNames.mkString(", "))

// Example of using two generators
for (i <- 1 to 3; j <- 4 to 6) {
  print("[" + i + "," + j + "]")
}
