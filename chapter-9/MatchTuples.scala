//You can use Pattern Matching to match against tuples. In this example we match against any tuple with two values in it. If the argument is not a tuple or match our string, then the wildcard will hand it.
def processCoordinates(input: Any) {
  input match {
    case (a, b) => printf("Processing (%d, %d)... ", a, b)
    case "done" => println("done")
    case _ => null
  }
}

processCoordinates((39, -104))
processCoordinates("done")
