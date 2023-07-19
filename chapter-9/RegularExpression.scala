//Scala supports regular expressions through classes in the 'scala.util.matching' package. When working with regular expressions, you are working with an instance of the Regex class in that package.
val pattern = "(S|s)cala".r
val str = "Scala is scalable and cool"

// find first occurrence
println(pattern findFirstIn str)

// find all occurrences
println((pattern findAllIn str).mkString(", "))

// replace matching text
println("cool".r replaceFirstIn(str, "awesome"))

