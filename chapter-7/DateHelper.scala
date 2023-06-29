//Scala provide implicit type conversions which can help extend the language and create your own vocabulary or syntax that is specific to your application and it's domain or to create you own DSL. Scala has some predefined implicity conversions already in the Predef object which is imported by default. An example would be '1 to 10' where 1 is an Int and converted to RichInt to invoke it's 'to' method. Scala applies at most one implicit conversion at a time.
import java.util._

class DateHelper(number: Int) {
  def days(when: String) : Date = {
    var date = Calendar.getInstance()
    when match {
      case "ago" => date.add(Calendar.DAY_OF_MONTH, -number)
      case "from_now" => date.add(Calendar.DAY_OF_MONTH, number)
      case _ => date
    }
    date.getTime()
  }
}

object DateHelper {
  val ago = "ago"
  val from_now = "from_now"

  implicit def convertInt2DateHelper(number: Int) = new DateHelper(number)
}

//Pretend this is in another file. Import the DateHelper companion object and have the DateHelper DSL ready.
import DateHelper._

val past = 2 days ago
val appointment = 5 days from_now

println(past)
println(appointment)
