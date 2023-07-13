//This example of pattern matching with a lowercase constant works because the variable 'max' uses the backtick to tell the compiler that it is a constant variable for the pattern matching.
class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int) {
    input match {
      case `max` => println("You matched max")
      case MIN => println("You matched min")
      case _ => println("Unmatched")
    }
  }
}

new Sample process 100
new Sample process 0
new Sample process 10
