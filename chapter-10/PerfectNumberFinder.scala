//Scala provides an event-based and lightweight threading. Actors are used to pass messages between each other. Actors are companion objects. Each accepts a function value / closure as a parameter and starts running as soon as you create it. Actors send messages with '!()' method and receieve messages with the 'receive()'. The receive accepts a closure and typically you'd use pattern matchin to process received messages.
import scala.actors.Actor._

def sumOfFactorsInRange(lower: Int, upper: Int, number: Int) = {
  ( 0 /: (lower to upper)) { (sum, i) => if (number % i == 0) sum + i else sum }
}

def isPerfectConcurrent(candidate: Int) = {
  val RANGE = 1000000
  val numberOfPartitions = (candidate.toDouble / RANGE).ceil.toInt
  val caller = self

  for(i <- 0 until numberOfPartitions) {
    val lower = i * RANGE + 1
    val upper = candidate min (i + 1) * RANGE

    actor {
      caller ! sumOfFactorsInRange(lower, upper, candidate)
    }
  }

  val sum = (0 /: (0 until numberOfPartitions)) { (partialSum, i) =>
    receive {
      case sumInRange : Int => partialSum + sumInRange
    }
  }

  2 * candidate == sum
}

println("6 is perfect? " + isPerfectConcurrent(6))
println("33550336 is perfect? " + isPerfectConcurrent(33550336))
println("33550337 is perfect? " + isPerfectConcurrent(33550337))
