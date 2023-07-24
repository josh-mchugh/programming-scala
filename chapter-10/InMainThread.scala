//Actors can run on their own threads, but actors can also share threads from the thread pool. If there is a need for more control, Scala allows for actors to use the main thread with SingleThreadedScheduler.
import scala.actors._
import Actor._

if(args.length > 0 && args(0) == "Single") {
  println("Command-line argument Single found")
  Scheduler.impl = new SingleThreadedScheduler
}

println("Main running in " + Thread.currentThread)

actor { println("Actor1 running in " + Thread.currentThread) }

actor { println("Actor2 running in " + Thread.currentThread) }

receiveWithin(3000) { case _ =>  }

trait SingleThreadedActor extends Actor {
  override protected def scheduler() = new SingleThreadedScheduler
}

class MyActor1 extends Actor {
  def act() = println("Actor1 running in " + Thread.currentThread)
}

class MyActor2 extends SingleThreadedActor {
  def act() = println("Actor2 running in " + Thread.currentThread)
}

println("Main running in " + Thread.currentThread)
new MyActor1().start()
new MyActor2().start()

actor { println("Actor3 running in " + Thread.currentThread) }

receiveWithin(3000) { case _ => }
