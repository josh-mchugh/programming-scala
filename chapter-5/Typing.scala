//Scala typing or compile-time type checking helps define and verify interface contracts at compile time. Scala does not expect you to provide redundant type information. You do not have to specify type in most cases nor do you have to repeat it. Scala will infer the tye and verify proper usage at compile time.

var year: Int = 2009
var anotherYear = 2009
var greet = "Hello there"
var builder = new StringBuilder("hello")

println(builder.getClass())
