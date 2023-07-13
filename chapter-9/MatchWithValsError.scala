//Scala pattern matching has some expectations when pattern matching. It expects pattern variables to start with lowercase letters and constants to start with uppercase letter. Scala will throw a compile error when a constant is in lowercase.
class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int) {
    input match {
      case max => println("Don't try this at home")
      case MIN => println("You matched min")
      case _ => println("Unreachable!!")
    }
  }
}

new Sample().process(100)
new Sample().process(0)
new Sample().process(10)
