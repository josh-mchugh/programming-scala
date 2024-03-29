# Programming Scala
Examples and cliff notes from my reading of Programming Scala. Programming Scala is a book to ramp up the Java Developer into the concepts of Scala to be able to hit the ground running.

## Chapter 2
In this chapter we install Scala and configure our enviroment to run Scala. We execute some code from the command line. Then we learn how to execute Scala code from a file and as a script. We then finally learn how to run it from an IDE and compile it with the "scalac" compiler".

## Chapter 3
In this chapter we compare Java to Scala with some code. We will compare the conciseness of scala. We see how Java and Scala are similar and how they differ. Scala brings a lot of new functionaliy to the JVM but how to becareful because Scala and Java do differ.

## Chapter 4
Scala is a fully object oriented functional programming language. It supports classes and objects. Within Scala everything is an object. Classes have primary constructors and auxilary constructors. It supports inheritance but differs from how Java implements it. Scala does not support static methods or classes but uses companion classes and objects.

## Chapter 5
This chapter covers Scala's static typing and typer inference. Scala's type inference allows for concise code. It allows us to write code without having to redundantly make type statements. It also covers who Scala base classes of Any and Nothing. Scala also supports optional data with Option[T], Set, and None. Scala has inference of method return types by the way the method is declared. If a method has an "=" then method type will be inferred otherwise it is consider a void return type. Collections in has to specifically expressed to allow use of derived or supertypes with association of the collection.

## Chapter 6
In this chapter we discover how Scala treats functions as first-class citizens. Scala allows for functions to be assigned to variables, parametrs and be used by other functions. Scala has a special use for the underscore character as we can traverse the paramter references with it. We can use Scala to use of functions as first-class citizens to execute code blocks and easily perform the Execute Around Method pathern with class and companion objects. Scala also allows for partial functions and closures giving you all the tools you need with functions to make concise and reuseable code.

## Chapter 7
We cover Scala Traits and Type conversions. Scala use of traits allows it be extend and combind functionality with objects. It easily allows for mixing crosscutting conerns with low ceremony. Scala allows for Typer conversions which allows for easy ability to create domain specific languages and develop domain languages.

## Chapter 8
In this chapter we see how Scala works with collections. Scala supports immutable versions of Set, Map, and List while also supporting a mutable version of Set and Map. We experiment with unary operators, understand colon with method names. Explored the versatility of the 'for' and its powerful functionality and expressiveness.

## Chapter 9
In this chapter we explore the power feature of Pattern Matching within Scala. Scala's pattern matching allows us to easily match literals, types, tuples, lists, regular expressions. Extractors can be used with pattern matching for more fine grain control over expressions. Scala brings a lot to the table for pattern matching.

## Chapter 10
This chapter demonstrated the power of Scala and it's actor model implementation which allows for asynchronous and concurrent operations. We explore how to use actors and send messages between. There are several ways to send and receive message in blocking and non-blocking methods. We even explored how to control the threading of actors as some may need to share threads from a thread pool.

## Chapter 11
Scala and Java can easily intermix. They both use the same bytecode. Scala can be ran with Java within it's Scala script or compile classes. When mixing Scala into Java it is good to keep in mind some of the functionality that might not translate such as closures, traits and unique feature to Scala. Java may allow you to use some keywords which are reserved for Scala's syntx.
