# Chapter 11
Scala and Java can easily intermix. They both use the same bytecode. Scala can be ran with Java within it's Scala script or compile classes. When mixing Scala into Java it is good to keep in mind some of the functionality that might not translate such as closures, traits and unique feature to Scala. Java may allow you to use some keywords which are reserved for Scala's syntx.

## Person.scala & usePerson.scala * UsePersonClass
Scala allows you to work with Scala clases in serpate files withoutexplicitly compiling them within your Scala scripts. Scala scripts may not need to be compiled; however, if you want to use Scala script files with compiled Scala, you must compile it files. Compiled Scala work with Compiled Scala. Script Scala works with Compiled and Script Scala.

## UseJDKClasses.scala
Using Java classes in Scala is simple. If it is apart of the standard JDK, then you simple just use it. When using Java code that has methods or fields with syntax names used by Scala keywords. Use with caught as they can cause issues with the compiler. Scala has a work around by letting you use a backtick around the field or method which shares the same work as the Scala syntax.

## Notes
Scala does not follow the the JavaBean convetion by defaul. You have to use the @scala.reflect.BeanProperty annotation to generate Fields, Methods and Constructors.

When designing your APO, if your classes are to be used from Java, provide normal methods in addition to high-order methods for your claases to be fully useable from Java.

Traits with no method implmentation are simple interfaces at bytecode leve. Use traits with no implementation to create interfaces for Java.

Scala does not have the throws clause. In scala you can throw any exception from any method without having to explicitly declare that part of the method signature.




