//Using Java classes in Scala is simple. If it is apart of the standard JDK, then you simple just use it. When using Java code that has methods or fields with syntax names used by Scala keywords. Use with caught as they can cause issues with the compiler. Scala has a work around by letting you use a backtick around the field or method which shares the same work as the Scala syntax.
import java.util.Date
import java.lang.reflect._

println("Today is " + new Date())

val methods = getClass.getMethods()
methods.foreach { method: Method => println(method.getName()) }
