# Chapter 8
TODO

## UsingSet.scala
Scala favors immutable collections. Mutable connections are available, if you want to mutable collection and are working in a single thread. Immutable collections are thread safe and side effect free which helps program correctness.  In this example we start with a set with 3 colors and then add another color. It does not modify the original Set but returns a new Set.

## UsingSet2.scala
Scala Set collection allows us to easily filter, merge, intersect, map, and iterator over the collection with it's useful functions. It's easy to complete these operations in one line of code.

## UsingMap.scala
Scala implmentation of Map comes in two types: immutable and mutable. When working with Maps, we can easily filter and retrieve values safely with it's funtions of 'filter' and 'get()'. It is good to keep in mind that Map is immutable and if you need to use a mutable Map, there is a version of that which can be used.

## UsingList.scala
In this example we demonstrate Scala's List. Unlike Set or Map, the List only comes in the immutable flavor. It has useful functions for accessing the first (head) and last element of the List. We can prefix and append a List with '::'. This returns a new list with the new element(s). Lists also have useful functions for filtering, all, any, exists, and map. They also support folding and contian many more useful functions.