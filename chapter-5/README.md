# Chapter 5
This chapter covers Scala's static typing and typer inference. Scala's type inference allows for concise code. It allows us to write code without having to redundantly make type statements. It also covers who Scala base classes of Any and Nothing. Scala also supports optional data with Option[T], Set, and None. Scala has inference of method return types by the way the method is declared. If a method has an "=" then method type will be inferred otherwise it is consider a void return type. Collections in has to specifically expressed to allow use of derived or supertypes with association of the collection.

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

## Methods.scala
Scala tries to infer the return type of methods. It depends on how youd define your methods. If you define a method with an equal sign, then Scala will infer the return type. Otherwise, it assumes the method is a void method.

## Trouble.java && PlayWithPets.scala
Scala will not allow for a collection with of type to accept an array of it's derived or super type. Scala will compain to try and protect this action from happening. With special syntax 'T <: Pet'. The 'T' in the sytax represents the class is derived from Pet. This additional syntax tells Scala to allow a collect typed derived from 'Pet'. Additional syntax can allow for collections to be of a supertype. The syntax follows the same concept but is formatted as such: '[S, D >: S]'. 'D' is the supertype of the Source 'S'.

## MyList.scala
If you are the author of the collection, it is ok for a collection of derived to be treated as a collection of base. You can allow this by marking your parameterized typed as '+T' instead of 'T'. '+T' tells Scala to allow covariance and accept the tpye or its base type.
