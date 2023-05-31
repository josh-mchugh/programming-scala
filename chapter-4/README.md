# Chapter 4
TODO

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
