// We can match Lists the same way as tuples. You can provide the elements you care about and leave the rest with the array explosion symbol (_*).
def processItems(items: List[String]) {
  items match {
    case List("apple", "ibm") => println("Apples and IBMs")
    case List("red", "blue", "white") => println("Stars and Stripes")
    case List("red", "blue", _*) => println("colors, red, blue, ...")
    case List("apples", "orange", otherFruits @ _*) => println("apples, oranges, and " + otherFruits)
  }
}

processItems(List("apple", "ibm"))
processItems(List("red", "blue", "green"))
processItems(List("red", "blue", "white"))
processItems(List("apples", "orange", "grapes", "dates"))
