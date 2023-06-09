//Scala supports Option which allows return an object which may contain a value or not. In the example we use 'Set' and 'None' which extend from 'Option[T]'. Option has a function called 'getOrElse' which allows us to handle 'None' or 'null' values.
def commentOnPractice(input: String) = {
  //rather than returning null
  if (input == "test") Some("good") else None
}

for(input <- Set("test", "hack")) {
  val comment = commentOnPractice(input)
  println("input " + input + " comment " + comment.getOrElse("Found no Comments"))
}
