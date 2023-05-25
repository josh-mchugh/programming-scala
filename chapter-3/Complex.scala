//Scala has no operator overloading, like '+' or '+-'. In Scala these are actually method names. Scala does not require a dot (.) between object references so we are able to have the illusion of operator overloading such as: ref1 + ref2. The previous statement is actually: ref1.+(ref2). This illusion is possible because of Scala's lenient method invocation syntax.
class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex) : Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  override def toString() : String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

val c1 = new Complex(1, 2)
val c2 = new Complex(2, -3)
val sum = c1 + c2
println("(" + c1 + ") + (" + c2 + ") = " + sum)
