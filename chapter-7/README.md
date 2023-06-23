# Chapter 7
TODO

## Friend.scala
A trait is like an interface with a partial implementation. The vals and vars you define and initialize in a trait get internally implemented in the classes that mix the trait in. Any vals or vars defined but not intialized are considered abstract and the classes that mix these traits are required to implement them. Traits look similar to classes but require the mixins class to implement uninitialized variables and values. Traits are compiled into Java interfaces with cooresponding implementation classes that hold any methods implemented in the traits.
