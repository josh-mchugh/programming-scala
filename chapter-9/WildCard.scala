//If there is a value that is not matched by one of the case expressions, we'll get a MatchError exception. We can control the values by using enums instead of String. Using a wild card '_' case expression can avoid the MatchException.
object DayOfWeek extends Enumeration {
  val SUNDAY = Value("Sunday")
  val MONDAY = Value("Monday")
  val TUESDAY = Value("Tuesday")
  val WEDNESDAY = Value("Wednesday")
  val THURSDAY = Value("Thursday")
  val FRIDAY = Value("Friday")
  val SATURDAY = Value("Saturday")
}

def activity(day: DayOfWeek.Value) {
  day match {
    case DayOfWeek.SUNDAY => println("Eat, sleep, repeat...")
    case DayOfWeek.SATURDAY => println("Hangout with friends...")
    case _ => println("...code for fun...")
  }
}

activity(DayOfWeek.SATURDAY)
activity(DayOfWeek.MONDAY)
