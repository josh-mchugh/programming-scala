//Instead of calling 'reactWithin()' recursively, you can use the method 'loop()'.  The 'loopWhile()' method is similar but only continues as long as the condition is valid. With 'loopWhile()' you can put local state outside of the loop and access it within 'reactWithin()'.
import scala.actors._
import Actor._

val caller = self

val accumulator = actor {
  var continue = true
  var sum = 0

  loopWhile(continue) {
    reactWithin(500) {
      case number: Int => sum += number
      case TIMEOUT =>
        continue = false
        caller ! sum
    }
  }
}

accumulator ! 1
accumulator ! 7
accumulator ! 8

receiveWithin(1000) { case result => println("Total is " + result) }
