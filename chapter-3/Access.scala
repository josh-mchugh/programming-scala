//Scala's access modifier is different from Java. Scala defaults to public. Scala gives fine grain control of visibility. Scal's 'protected' is akin to C++ and C# and only derived classes can access it. Scala like Java has encapsulation at the class level and you can access the private fields and methods of any object of your class within an instance method; however, you can restrict it like Ruby.
//By default Scala treats classes, fields and methods as public if you don't use an access modifer. You can make the primary constructor private. If you want to make a member private or proected, simply mark it with the respective keyworld.
class Microwave {
  def start() = println("started")
  def stop() = println("stopped")
  private def turnTable() = println("turning table")
}

val microwave = new Microwave
microwave.start()
microwave.turnTable()
