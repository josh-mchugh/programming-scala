# Chapter 10
TODO

## PerfectNumberFinder.scala
Scala provides an event-based and lightweight threading. Actors are used to pass messages between each other. Actors are companion objects. Each accepts a function value / closure as a parameter and starts running as soon as you create it. Actors send messages with '!()' method and receieve messages with the 'receive()'. The receive accepts a closure and typically you'd use pattern matchin to process received messages.

## MessagePassing.scala & AskFortune.scala
Each Actor has it's own message queue, it receives input from an InputChannel and sends output through an OutputChannel. Actors can send messages to others and themself. An actor is not blocked on sending messages but is when it calls receive(). Actors do not get interrupted by messages.
Actors send and receive message asynchronously. Messages can be sent synchronously between actors with '!?()'. This will block until it receives a response, which may lead to deadlocks.
