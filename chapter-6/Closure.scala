//Close can bind variables and functions outside of their local scope or parameter list. In the examples, the closure passed into our method references the 'result' variable outside the scope of the method. 
def loopThrough(number: Int)(closure: Int => Unit) {
  for(i <- 1 to number) { closure(i) }
}

var result = 0
val addIt = { value: Int => result += value }

loopThrough(10) { addIt }
println("Total of values from 1 to 10 is " + result)

result = 0
loopThrough(5) { addIt }
println("Total of values from 1 to 5 is " + result)

var product = 1
loopThrough(5) { product *= _ }
println("Product of values from 1 to 5 is " + product)
