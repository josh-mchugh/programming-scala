# Chapter 3
In this chapter we compare Java to Scala with some code. We will compare the conciseness of scala. 

## Greetings.java & Greetings.scala
In this example we demonstrate that Scala can reduce a lot of cerefmony that Java brings such as class declaration, static main, semi-colons, and static references to System.out and typer inferance.

## GreetingsExclusiveUpper.scala
Scala 'for' loops are lightweight and define 'val' on the left side and use a generator on the right side of the expression. With the expression we can use different functions to include or exclude the upper bounds. In the example below we use the 'util' method to define the upper bounds of the loop.

## GreetingsForEach.scala
With Scala the code can be even more concise by using the functional 'foreach'. The 'foreach' function no longer has assignments, and accepts a function value as a parameter. We provide the body of code for the one argument and use a Range type for the implementation.

## ScalaInt.scala
Scala treaats everything as objects. There are no primitives in Scala. Scala can work with Java by quietly treating Scala objects as primitives when it is needed. There is no performance loss at runtime for these type conversions either.

## MultipleAssignment.scala
Scala supports tuples and multiple assignments. A tuple is an immutable object sequence created as comma-seperated values.

## MultipleAssignment2.scala
Scala will not allow you to assign fewer or more variables to your tuple or assigned values. It will be caught at compile time.

## MultiLine.scala
Scala Strings are not like Java Strings. You can use them as you would in Java but they have additional functionality. Scala can automatically convert a String to a scala.runtime.RichString which opens up additional methods such as 'capitialize()', 'lines()', and 'reverse()'. Scala also supports multiple likes with triple quotes ("""...""").

## MultiLine2.scala
Scala multi line strings allows for emedded quotes within the String. Multi line strings also takes indentations literally. We can use a RichString method called 'stripMargin' to remove all the blank or control characters before the leading pipe (|).
