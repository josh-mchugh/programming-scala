# Chapter 10
TODO

## PerfectNumberFinder.scala
Scala provides an event-based and lightweight threading. Actors are used to pass messages between each other. Actors are companion objects. Each accepts a function value / closure as a parameter and starts running as soon as you create it. Actors send messages with '!()' method and receieve messages with the 'receive()'. The receive accepts a closure and typically you'd use pattern matchin to process received messages.
