//The result of the assignment operation (a = b) in Scala is a Unit. In Java, the reslt of the assignment is the value of a, so multiple assignments like (a = b = c) can appear in series in Java. In Scala since the result of an assignment is Unit, the assignment of another variable will result in a type mismatch error.
var a, b, c = 1

a = b = c
