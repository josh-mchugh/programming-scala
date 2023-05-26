//Scala infers a semicolon if your statement does not end with an infix notation like (+,*,or.) or is not within paraentheses or square brackets. It also infers a semicolon if the next statement starts with something thta can start a statement.

//The code statement ends with a semicolon so Scala knows the {} is a code block.
val list1 = new java.util.ArrayList[Int];
{
  println("Created list1")
}

//No semicolon after the Array declaration so Scala assumes we are creating an anonymous inner class that derives from ArrayList[Int].
val list2 = new java.util.ArrayList[Int]
{
  println("Created list2")
}

println(list1.getClass())
println(list2.getClass())
