//Scala handles == differently than Java. It is consistent across all types and represents value-based comparison no matter the type. This is ensured by implementing ==() as a funal in the class Any which all Scala classes in Scala derive from. If you want to perform an identity based comparison in Scala then use the (eq) method.
val str1 = "hello"
val str2 = "hello"
val str3 = new String("hello")

println(str1 == str2)
println(str2 eq str2)
println(str1 == str3)
println(str1 eq str3)
