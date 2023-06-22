//In Scala you can send only a few arguments to function and get back partially applied function. This gives you the convenience of binding some arguments and leaving the rest to be filled in later. When a partially applied function is created, Scala internally creates a new class with a special 'apply()' method. When the partially applied function is invoked, it is actually invoking that apply method.
import java.util.Date

def log(date: Date, message: String) {
  println(date + "-----" + message)
}

val date = new Date
log(date, "message1")
log(date, "message2")
log(date, "message3")

val logWithDateBound = log(new Date, _ : String)
logWithDateBound("message1")
logWithDateBound("message2")
logWithDateBound("message3")
