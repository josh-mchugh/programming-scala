//Scala allows you to mix in traits at an instance level. Scala has a keyword 'with' which will allow you to mix in a trait to a specific instance. Scala gives the flexibility to treat all classes as a trait or to select only the instances you want. It is especially useful if you want to apply traits to preexisting classes.
trait Friend {
  val name: String
  def listen() = println("Your friend " + name + " is listening")
}

class Human(val name: String) extends Friend

class Man(override val name: String) extends Human(name)

class Woman(override val name: String) extends Human(name)

class Animal

class Dog(val name: String) extends Animal with Friend {
  override def listen = println(name + "'s listening quietly")
}

class Cat(val name: String) extends Animal

def useFriend(friend: Friend) = friend.listen()

val snowy = new Cat("Snowy") with Friend
val friend : Friend = snowy
friend.listen

useFriend(snowy)
