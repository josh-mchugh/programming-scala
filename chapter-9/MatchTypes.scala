//Scala's pattern matching can handle a squence of values that are not all of the same type. It can handle single values, elements of tuple. It also allows for guards. Guards are provided sing the if clause and must be satisified for the expression to be evaulated. The order of the cases in the pattern matching is important. Scala evaluates from the top down.
def process(input: Any) {
  input match {
    case (a: Int, b: Int) => print("Processing (int, int)...")
    case (a: Double, b: Double) => print("Processing (double, double)...")
    case msg: Int if (msg > 100000) => println("Processing int > 100000")
    case msg: Int => print("Processing int...")
    case msg: String => println("Processing string...")
    case _ => printf("Can't handle %s...", input)
  }
}

process((34.2, -159.3))
process(0)
process(100005)
process(2.2)
