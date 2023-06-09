//Scala provides type interence and type safety with Java Generics collection. This example shows the first delcaration uses explicity and redundant typing. The second declaration leverages the Scala type inference.
import java.util._

var list1: List[Int] = new ArrayList[Int]
var list2 = new ArrayList[Int]

list2 add 1
list2 add 2

var total = 0
for (index <- 0 until list2.size()) {
  total += list2 get index
}

println("Total is " + total)
