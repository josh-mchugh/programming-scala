
# Chapter 7
TODO

## Friend.scala
A trait is like an interface with a partial implementation. The vals and vars you define and initialize in a trait get internally implemented in the classes that mix the trait in. Any vals or vars defined but not intialized are considered abstract and the classes that mix these traits are required to implement them. Traits look similar to classes but require the mixins class to implement uninitialized variables and values. Traits are compiled into Java interfaces with cooresponding implementation classes that hold any methods implemented in the traits.

## Friend2.scala
Scala allows you to mix in traits at an instance level. Scala has a keyword 'with' which will allow you to mix in a trait to a specific instance. Scala gives the flexibility to treat all classes as a trait or to select only the instances you want. It is especially useful if you want to apply traits to preexisting classes.
