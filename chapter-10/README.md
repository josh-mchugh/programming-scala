# Chapter 10
TODO

## PerfectNumberFinder.scala
Scala provides an event-based and lightweight threading. Actors are used to pass messages between each other. Actors are companion objects. Each accepts a function value / closure as a parameter and starts running as soon as you create it. Actors send messages with '!()' method and receieve messages with the 'receive()'. The receive accepts a closure and typically you'd use pattern matchin to process received messages.

## MessagePassing.scala & AskFortune.scala
Each Actor has it's own message queue, it receives input from an InputChannel and sends output through an OutputChannel. Actors can send messages to others and themself. An actor is not blocked on sending messages but is when it calls receive(). Actors do not get interrupted by messages.
Actors send and receive message asynchronously. Messages can be sent synchronously between actors with '!?()'. This will block until it receives a response, which may lead to deadlocks.

## AnsweringService.scala
Scala Actor is just a trait which allows us to mix it in however we would like. It gives the ability to create objects which have the actor trait.

## PrimeTeller.scala
In Scala you can pass data between actors using the '!()' and 'receive' methods. Actors process each message it receives in the order they receieve them. You can process multiple message concurrently. Scala allows you to write concurrent code effortlessly and in a thread safe manner with immutable objects.

## React.scala & ReactWithin.scala
When calling 'receive' from actors, it uses a thread which is held onto until the actor is done completely. Scala provides a more effective way of sending messages without holding onto threads with the 'react' method. Similar 'reactWithin()' will timout if any message is not received within the time peroid.

## Loop.scala
Instead of calling 'reactWithin()' recursively, you can use the method 'loop()'.  The 'loopWhile()' method is similar but only continues as long as the condition is valid. With 'loopWhile()' you can put local state outside of the loop and access it within 'reactWithin()'.

## InMainThread.scala
Actors can run on their own threads, but actors can also share threads from the thread pool. If there is a need for more control, Scala allows for actors to use the main thread with SingleThreadedScheduler.
