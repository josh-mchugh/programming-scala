//Scala supports operators that are targeted at an instance that follows them. These are the unary operators: +, -, !, ~. As you get comfortable with Scala, you will develop a Scala eye.
class Sample {
  def unary_+ = println("Called unary +")
  def unary_- = println("Called unary -")
  def unary_! = println("Called unary !")
  def unary_~ = println("Called unary ~")
}

val sample = new Sample
  +sample
  -sample
  !sample
  ~sample
