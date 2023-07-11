//When using pattern matching with a literal you do not have to do much to match it. The match expression acts as Any. It performs pattern matching on the target and invokes the appropriate case expression. You can directly match against literals and constants. The literals can be different types as the match does not care.
def activity(day: String) {
  day match {
    case "Sunday" => print("Eat, sleep, repeat...")
    case "Saturday" => print("Hangout with friends...")
    case "Monday" => print("...code for fun..")
    case "Friday" => print("..read a good book..")
  }
}

List("Monday", "Sunday", "Saturday").foreach { activity }
