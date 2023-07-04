//Scala implmentation of Map comes in two types: immutable and mutable. When working with Maps, we can easily filter and retrieve values safely with it's funtions of 'filter' and 'get()'. It is good to keep in mind that Map is immutable and if you need to use a mutable Map, there is a version of that which can be used.
val feeds = Map(
  "Andy Hunt" -> "blog.toolshed.com",
  "Dave Thomas" -> "pragdave.pragprog.com",
  "Dan Steinberg" -> "dimsumthinking.com/blog"
)

// Filter names that start with 'D'
// Example of using map on Maps
val filterNameStartWithD = feeds filterKeys(_ startsWith "D")
println("# of Filtered: " + filterNameStartWithD.size)

// Filter on the values of key and value of the map
// Example of using map on Maps
val filterNameWithDAndBlogInFeed = feeds filter { element =>
  val (key, value) = element
  (key startsWith "D") && (value contains "blog")
}
println("# of feeds with auth name D* and blog in URL: " + filterNameWithDAndBlogInFeed.size)

// Retrieving values from the map with 'get()'
// Returns an Option with a resule of Some[T] or None
println("Get Andy's feed: " + feeds.get("Andy Hunt"))
println("Get Bill's feed: " + feeds.get("Bill Who"))

// Retrieving values with the 'apply()' method
// Return the value or throws an exception.
try {
  println("Get Andy's feed using 'apply(): " + feeds("Andy Hunt"))
  print("Get Bill's feed: ")
  println(feeds("Bill Who"))
} catch {
  case ex: java.util.NoSuchElementException => println("Not Found")
}

// Adding values to the Map with 'update()'
// Example of adding a value to an immutable map
val newFeeds1 = feeds + ("Venkat Subramaniam" -> "agiledeveloper.com/blog")
println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
println("Venkat's blog in new feed: " + newFeeds1("Venkat Subramaniam"))

// Using mutable Map
// Example of creating mutable Map
val mutableFeeds = scala.collection.mutable.Map(
  "Scala Book Forum" -> "forums.pragprog.com/forums/87"
)
mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forums/55"
println("Number of forums: " + mutableFeeds.size)
