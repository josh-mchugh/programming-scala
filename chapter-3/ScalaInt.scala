// Scala treaats everything as objects. There are no primitives in Scala. Scala can work with Java by quietly treating Scala objects as primitives when it is needed. There is no performance loss at runtime for these type conversions either.
class ScalaInt {
  def playWithInt() {
    val capacity : Int = 10
    val list = new java.util.ArrayList[String]
    list.ensureCapacity(capacity)
  }
}
