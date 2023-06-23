//A trait is like an interface with a partial implementation. The vals and vars you define and initialize in a trait get internally implemented in the classes that mix the trait in. Any vals or vars defined but not intialized are considered abstract and the classes that mix these traits are required to implement them. Traits look similar to classes but require the mixins class to implement uninitialized variables and values. Traits are compiled into Java interfaces with cooresponding implementation classes that hold any methods implemented in the traits.
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

val john = new Man("John")
val sara = new Woman("Sara")
val comet = new Dog("Comet")

john.listen
sara.listen
comet.listen

val mansBestFriend : Friend = comet
mansBestFriend.listen

def helpAsFriend(friend: Friend) = friend.listen()

helpAsFriend(sara)
helpAsFriend(comet)
