// Scala 'for' loops are lightweight and define 'val' on the left side and use a generator on the right side of the expression. With the expression we can use different functions to include or exclude the upper bounds. In the example below we use the 'util' method to define the upper bounds of the loop.
for (i <- 1 until 3) {
  print(i + ",")
}

println("Scala Rockers!!!")
