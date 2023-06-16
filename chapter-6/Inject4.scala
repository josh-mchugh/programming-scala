//Currying in Scala transforms a function that takes more than one paramter into a function that takes multiple paramter lists. Curry allows for us to reduce code instead of making multiple function calls with the same set of arguments. Scala creates partially applied functions and chains them together until they create a Unit.
def inject(arr: Array[Int], initial: Int)(operation: (Int, Int) => Int) : Int = {
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element))
  carryOver
}

val array = Array(2, 3, 5, 1, 6, 4)
val sum = inject(array, 0) { (carryOver, elem) => carryOver + elem }
println("Sum of elements in array " + array.mkString(", ") + " is " + sum)
