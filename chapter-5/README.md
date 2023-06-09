# Chapter 5
TODO

## Typing.scala
Scala typing or compile-time type checking helps define and verify interface contracts at compile time. Scala does not expect you to provide redundant type information. You do not have to specify type in most cases nor do you have to repeat it. Scala will infer the tye and verify proper usage at compile time.

## Generics.scala
Scala provides type interence and type safety with Java Generics collection. This example shows the first delcaration uses explicity and redundant typing. The second declaration leverages the Scala type inference.

## Generics2.scala
Scala is vigilant about the type of the object that are instaniated. It prohibits conversions that may cause typing issues. When declaring an ArrayList without a type, Scala behind the scenes assigns the type 'Nothing'. This is the cause of the error in the example when trying to assign an ArrayList[Int] to ArrayList[Nothing].

## Generics3.scala
We can alter the default behavior in Scala to allow assignment of Generics with the type 'Any'. 'Any' is the base type for all types in Scala. Scala does not allow by defaulting assigning a collection of arbitrary type to a reference of a collection of 'Any' type. Scala does a llow us to assign variable references of Int type to an Any type. It will not allow us to assign ArrayList[Int] to Arraylist[Any].

## OptionExample.scala
Scala supports Option which allows return an object which may contain a value or not. In the example we use 'Set' and 'None' which extend from 'Option[T]'. Option has a function called 'getOrElse' which allows us to handle 'None' or 'null' values.
