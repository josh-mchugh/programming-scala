
# Chapter 7
We cover Scala Traits and Type conversions. Scala use of traits allows it be extend and combind functionality with objects. It easily allows for mixing crosscutting conerns with low ceremony. Scala allows for Typer conversions which allows for easy ability to create domain specific languages and develop domain languages.

## Friend.scala
A trait is like an interface with a partial implementation. The vals and vars you define and initialize in a trait get internally implemented in the classes that mix the trait in. Any vals or vars defined but not intialized are considered abstract and the classes that mix these traits are required to implement them. Traits look similar to classes but require the mixins class to implement uninitialized variables and values. Traits are compiled into Java interfaces with cooresponding implementation classes that hold any methods implemented in the traits.

## Friend2.scala
Scala allows you to mix in traits at an instance level. Scala has a keyword 'with' which will allow you to mix in a trait to a specific instance. Scala gives the flexibility to treat all classes as a trait or to select only the instances you want. It is especially useful if you want to apply traits to preexisting classes.

## Decorators.scala
Traits in Scala allow you to mix in crosscutting concerns, and you can use them to create highly extensible code with low ceremony. Rather than creating a hierarchy of classes and interfaces, you can put your essential code to quick use.

## MethodBinding.scala
Scala's traits can get a bit complex with abstracted base methods. Scala will start with the last trait and work its way to the first trait. The order of the traits are important if you expect specific outcomes.

## DateHelper.scala
Scala provide implicit type conversions which can help extend the language and create your own vocabulary or syntax that is specific to your application and it's domain or to create you own DSL. Scala has some predefined implicity conversions already in the Predef object which is imported by default. An example would be '1 to 10' where 1 is an Int and converted to RichInt to invoke it's 'to' method. Scala applies at most one implicit conversion at a time.
