# Chapter 9
TODO

## MatchLiterals.scala
When using pattern matching with a literal you do not have to do much to match it. The match expression acts as Any. It performs pattern matching on the target and invokes the appropriate case expression. You can directly match against literals and constants. The literals can be different types as the match does not care.

## WildCard.scala
If there is a value that is not matched by one of the case expressions, we'll get a MatchError exception. We can control the values by using enums instead of String. Using a wild card '_' case expression can avoid the MatchException.

## MatchTuples.scala & MatchList.scala
You can use Pattern Matching to match against tuples. In this example we match against any tuple with two values in it. If the argument is not a tuple or match our string, then the wildcard will hand it.
 We can match Lists the same way as tuples. You can provide the elements you care about and leave the rest with the array explosion symbol (_*).
 
## MatchTypes.scala
Scala's pattern matching can handle a squence of values that are not all of the same type. It can handle single values, elements of tuple. It also allows for guards. Guards are provided sing the if clause and must be satisified for the expression to be evaulated. The order of the cases in the pattern matching is important. Scala evaluates from the top down.
