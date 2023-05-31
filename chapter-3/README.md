# Chapter 3
In this chapter we compare Java to Scala with some code. We will compare the conciseness of scala. We see how Java and Scala are similar and how they differ. Scala brings a lot of new functionaliy to the JVM but how to becareful because Scala and Java do differ.

## Greetings.java & Greetings.scala
In this example we demonstrate that Scala can reduce a lot of cerefmony that Java brings such as class declaration, static main, semi-colons, and static references to System.out and typer inferance.

## GreetingsExclusiveUpper.scala
Scala 'for' loops are lightweight and define 'val' on the left side and use a generator on the right side of the expression. With the expression we can use different functions to include or exclude the upper bounds. In the example below we use the 'util' method to define the upper bounds of the loop.

## GreetingsForEach.scala
With Scala the code can be even more concise by using the functional 'foreach'. The 'foreach' function no longer has assignments, and accepts a function value as a parameter. We provide the body of code for the one argument and use a Range type for the implementation.

## ScalaInt.scala
Scala treats everything as objects. There are no primitives in Scala. Scala can work with Java by quietly treating Scala objects as primitives when it is needed. There is no performance loss at runtime for these type conversions either.

## MultipleAssignment.scala
Scala supports tuples and multiple assignments. A tuple is an immutable object sequence created as comma-seperated values.

## MultipleAssignment2.scala
Scala will not allow you to assign fewer or more variables to your tuple or assigned values. It will be caught at compile time.

## MultiLine.scala
Scala Strings are not like Java Strings. You can use them as you would in Java but they have additional functionality. Scala can automatically convert a String to a scala.runtime.RichString which opens up additional methods such as 'capitialize()', 'lines()', and 'reverse()'. Scala also supports multiple likes with triple quotes ("""...""").

## MultiLine2.scala
Scala multi line strings allows for emedded quotes within the String. Multi line strings also takes indentations literally. We can use a RichString method called 'stripMargin' to remove all the blank or control characters before the leading pipe (|).

## Complex.scala
Scala has no operator overloading, like '+' or '+-'. In Scala these are actually method names. Scala does not require a dot (.) between object references so we are able to have the illusion of operator overloading such as: ref1 + ref2. The previous statement is actually: ref1.+(ref2). This illusion is possible because of Scala's lenient method invocation syntax.

## Complex2.scala
Scala perseves the order of operations by precedence on methods. The first character of each method determines the order their priority. If two methods have the same pirority then the expression to the left takes higher priority.

## SerialAssignments.scala
The result of the assignment operation (a = b) in Scala is a Unit. In Java, the reslt of the assignment is the value of a, so multiple assignments like (a = b = c) can appear in series in Java. In Scala since the result of an assignment is Unit, the assignment of another variable will result in a type mismatch error.

## Equality.scla
Scala handles == differently than Java. It is consistent across all types and represents value-based comparison no matter the type. This is ensured by implementing ==() as a funal in the class Any which all Scala classes in Scala derive from. If you want to perform an identity based comparison in Scala then use the (eq) method.

## OptionalSemicolon.scala
Scala infers a semicolon if your statement does not end with an infix notation like (+,*,or.) or is not within paraentheses or square brackets. It also infers a semicolon if the next statement starts with something thta can start a statement.

## Access.scala
By default Scala treats classes, fields and methods as public if you don't use an access modifer. You can make the primary constructor private. If you want to make a member private or proected, simply mark it with the respective keyworld.

## Protected.scala
In Scala, protected makes the decorated members visible to the class and its derived classes only. Other classes that belong to the package cannot access these members. Furthermore, the derived class can access the protected members only on its own type.

## FineGrainedAccessControl.scala
Scala gives far greater flexibility and also fine-grained control over setting access visibility. You can specify additional parameters for private and protected modifiers. Scala allows you to defind nested packages.

## AvoidExplicitReturns.scal
In Scala it is not good practice to use returns from methods. Scala sees a return and bails out of that method. It affects Scala's ability to infer the return type.
