//Scala allows you to work with Scala clases in serpate files withoutexplicitly compiling them within your Scala scripts. Scala scripts may not need to be compiled; however, if you want to use Scala script files with compiled Scala, you must compile it files. Compiled Scala work with Compiled Scala. Script Scala works with Compiled and Script Scala.
class Person(val firstName: String, val lastName: String) {
  override def toString(): String = firstName + " " + lastName
}

class Dog(val name: String) {
  override def toString(): String = name
}
