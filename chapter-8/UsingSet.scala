//Scala favors immutable collections. Mutable connections are available, if you want to mutable collection and are working in a single thread. Immutable collections are thread safe and side effect free which helps program correctness.  In this example we start with a set with 3 colors and then add another color. It does not modify the original Set but returns a new Set.
val colors1 = Set("Blue", "Green", "Red")
val colors = colors1 + "Black"
println("colors: " + colors)
println("colors1: " + colors1)
