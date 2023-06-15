//Function values can have multiple parameters. Scala also has concise syntax for 'foldLeft' which is '/:' which keeps the code short and sweet.
def inject(arr: Array[Int], initial: Int, operation: (Int, Int) => Int) : Int  = {
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element))
  carryOver
}

val array = Array(2, 3, 5, 1, 6, 4)

val sum = inject(array, 0, (carryOver, elem) => carryOver + elem)

println("Sum of elements in array " + array.mkString(", ") + " is " + sum)

val max = inject(array, Integer.MIN_VALUE, (carryOver, elem) => Math.max(carryOver, elem))

println("Max of elements in array " + array.mkString(", ") + " is " + max)

val min = inject(array, Integer.MAX_VALUE, (carryOver, elem) => Math.min(carryOver, elem))
println("Min of elements in array " + array.mkString(", ") + " is " + min)
