//Scala's traits can get a bit complex with abstracted base methods. Scala will start with the last trait and work its way to the first trait. The order of the traits are important if you expect specific outcomes.
abstract class Writer {
  def writeMessage(message: String)
}

trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String) = super.writeMessage(message.toUpperCase())
}

trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String) = super.writeMessage(message.replace("stupid", "s-----"))
}

class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter

  def writeMessage(message: String) = writer.write(message)
  override def toString(): String = writer.toString()
}

val myWriterProfanityFirst = new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter

val myWriterProfanityLast = new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

myWriterProfanityFirst.writeMessage("There is no sin except stupidity")
myWriterProfanityLast writeMessage "There is no sin expect stupidity"

println(myWriterProfanityFirst)
println(myWriterProfanityLast)
