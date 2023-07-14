//When passing a case classes of Any type through a pattern match, becareful of what you send as you may send a companion object or a function instead of an instance of case class.
case class Apple()
case class Orange()
case class Book()

class ThingsAcceptor {
  def acceptStuff(thing: Any) {
    thing match {
      case Apple() => println("Thanks for the Apple")
      case Orange() => println("Thanks for the Orange")
      case Book() => println("Thanks for the Book")
      case _ => println("Excuse me, why did you send me a " + thing)
    }
  }
}

val acceptor = new ThingsAcceptor
acceptor.acceptStuff(Apple())
acceptor.acceptStuff(Book())
acceptor.acceptStuff(Apple)
