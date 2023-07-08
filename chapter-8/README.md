# Chapter 8
In this chapter we see how Scala works with collections. Scala supports immutable versions of Set, Map, and List while also supporting a mutable version of Set and Map. We experiment with unary operators, understand colon with method names. Explored the versatility of the 'for' and its powerful functionality and expressiveness. 

## UsingSet.scala
Scala favors immutable collections. Mutable connections are available, if you want to mutable collection and are working in a single thread. Immutable collections are thread safe and side effect free which helps program correctness.  In this example we start with a set with 3 colors and then add another color. It does not modify the original Set but returns a new Set.

## UsingSet2.scala
Scala Set collection allows us to easily filter, merge, intersect, map, and iterator over the collection with it's useful functions. It's easy to complete these operations in one line of code.

## UsingMap.scala
Scala implmentation of Map comes in two types: immutable and mutable. When working with Maps, we can easily filter and retrieve values safely with it's funtions of 'filter' and 'get()'. It is good to keep in mind that Map is immutable and if you need to use a mutable Map, there is a version of that which can be used.

## UsingList.scala
In this example we demonstrate Scala's List. Unlike Set or Map, the List only comes in the immutable flavor. It has useful functions for accessing the first (head) and last element of the List. We can prefix and append a List with '::'. This returns a new list with the new element(s). Lists also have useful functions for filtering, all, any, exists, and map. They also support folding and contian many more useful functions.

## Colon.scala & Unary.scala
In scala the last character in a method name can determine the target of the method call. If a method name ends with a colon, then the target of the call is the instance that follows it.
Scala supports operators that are targeted at an instance that follows them. These are the unary operators: +, -, !, ~. As you get comfortable with Scala, you will develop a Scala eye.

## PowerOfFor.scala
Scala provides a powerful 'for' loop syntax which allows for o





















perators, mapping, fildering, yield, and generators to be used within the iterations. It provides a clean and versitle way to iterate over iterables.
