//Scala provides the notion of '_'. The underscore represents paramters of a function value. Each time the underscore is used within a function, it represents a subsequent parameter.
val arr = Array(1, 2, 3, 4, 5)

println("Sum of all values in array is " + (0 /: arr) { _ + _ })

val negativeNumberExists = arr.exists { _ < 0 }
println("Array has negative numbers? " + negativeNumberExists)
