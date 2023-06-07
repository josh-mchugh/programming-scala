# Chapter 4
Scala is a fully object oriented functional programming language. It supports classes and objects. Within Scala everything is an object. Classes have primary constructors and auxilary constructors. It supports inheritance but differs from how Java implements it. Scala does not support static methods or classes but uses companion classes and objects.

## Car.java
In this example of a Java class, it follows the the bean convention of exposing its properties. It has two properties, and corresponding getter methods. It also has a method to manipulate the miles property. It also has a constructor which intitializes the final field year.

## Car.scala
In Java we explicity defined the field and method for the property year and wrote an explicit constructor. Scala, the parameter took care of defining that field and writing the accessor method. Scala accomplishes the same thing wih more concise code.

## CreditCard.scala
Scala rolls the primary constructor into the class definition and procives concise way to define fields and corresponding methods. For small Scala classes you do not even need the {}. Scala classes default to public unless specified. When using 'val' in Scala, it will make it as final and generate a getting method. When using 'var' in Scala it will generate a getter and setter for the variable. If 'val' or 'var' is not declared it will create a priate field with private getters and setters.

## Sample.scala
Any expression or executable statement you put into your class definition is actually executed as part of the primary constructor.

## Person.scala
Scala can also define other fields, methods, and auxiliary constructors. In this example, the primary constructor takes two parameters. The auziliary constructor takes three parameters. The first call within an auxiliary constructor is required to call the primary constructor or another auxilary constructor. Scala treats field specially, any var defined within in a class is mapped to private and has corresponding accessor methods. 

## Vehicle.scala
Extending classes in Scala is similar to Java expect for two restrictions: method overriding requires the 'override' keyword and only the primary constructor can pass parameters to the base constructor. Scala avoid override methods by acciedent by requiring the keyword. Auxiliary constructors have to call either the primary constructor or another auxiliary constructor.

## Singleton.scala
Scala makes it very easy to create singleton. To create a singleton you use the keyword 'object' instead of 'class'. Since you cannot instantiate a singleton object, you cannot pass parameters to the primary constructor.

## Markers.scala & UseMarker.scala
Scala allows you to create a singleton that is connected to a class. The singleton will share the same name as a class name and is called a compainion object. The class is called a companion class. Companion classes and objects have no boundry and can access the private fields and methods of each other. 

## Static.scala
Scala does not have static fields and methods. Allowing static fields and methods would break the fully object-oriented model that Scala supports. Scala supports class-level operations and properties. Companion objects allow us to call methods like static methods. Companion objects also have the ability to create instances of the companion class without the new keyword via the 'apply()' method.
