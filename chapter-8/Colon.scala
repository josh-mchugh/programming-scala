//In scala the last character in a method name can determine the target of the method call. If a method name ends with a color, then the target of the call is the instance that follows it.
class Cow {
  def ^(moon: Moon) = println("Cow jumped over the moon")
}

class Moon {
  def ^:(cow: Cow) = println("This cow jumped over the moon too")
}

val cow = new Cow
val moon = new Moon

cow ^ moon
cow ^: moon
