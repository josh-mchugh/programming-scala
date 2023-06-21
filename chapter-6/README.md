# Chapter 6
TODO

## FunctionValues.scala
Scala allows you to create functions within functions and assign them to references and pass them around to other functions. Scala function values are really objects as Scala internally creating them as instances of special classes. 

## FunctionValuesMultiParams.scala
Scala allows you to create functions within functions and assign them to references and pass them around to other functions. Scala function values are really objects as Scala internally creating them as instances of special classes. 

## Inject4.scala
Currying in Scala transforms a function that takes more than one paramter into a function that takes multiple paramter lists. Curry allows for us to reduce code instead of making multiple function calls with the same set of arguments. Scala creates partially applied functions and chains them together until they create a Unit.

## Equipment.scala
Scala let you define full functions within other functions. In our example we pass the function into two different instances. This way if the function changes we do not have to change it in two different places. This way we eliminate duplicate code.  Scala allows for good design principles and code quality.

## Underscore.scala
Scala provides the notion of '_'. The underscore represents paramters of a function value. Each time the underscore is used within a function, it represents a subsequent parameter.

## Resource.scala
Scala provides a way to easily implement and construct 'Execute around method' pattern. In this example we create a private class and companion object which starts a transaction via the constructor, then executes a code block and follows up by cleaning up afterwards.

## WriteToFile.scala
Example of using the Execute Around Method pattern or Loan pattern. This example uses the PrintWriter to write to the file. The user of the 'writeToFile' method does not have to worry about closing the file.
