//Each Actor has it's own message queue, it receives input from an InputChannel and sends output through an OutputChannel. Actors can send messages to others and themself. An actor is not blocked on sending messages but is when it calls receive(). Actors do not get interrupted by messages.
import scala.actors.Actor._

var startTime : Long = 0
val caller = self

val engrossedActor = actor {
  println("Number of messages received so far? " + mailboxSize)
  caller ! "send"
  Thread.sleep(3000)
  println("Number of messages received while I was busy? " + mailboxSize)

  receive {
    case msg =>
      val receivedTime = System.currentTimeMillis() - startTime
      println("Received message " + msg + " after " + receivedTime + " ms")
  }

  caller ! "received"
}

received { case _ =>  }

println("Sending Message ")
startTime = System.currentTimeMillis()
engrossedActor ! "hello buddy"
val endTime = System.currentTimeMillis() - startTime

printf("Took less than %dms to send message\n", endTime)

receive {
  case _ =>
}
