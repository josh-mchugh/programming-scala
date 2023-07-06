//In this example we demonstrate Scala's List. Unlike Set or Map, the List only comes in the immutable flavor. It has useful functions for accessing the first (head) and last element of the List. We can prefix and append a List with '::'. This returns a new list with the new element(s). Lists also have useful functions for filtering, all, any, exists, and map. They also support folding and contian many more useful functions.
val feeds = List(
  "blog.toolshed.com",
  "pragdave.pragprog.com",
  "dimsumthinking.com/blog"
)

println("First feed: " + feeds.head)
println("Second feed: " + feeds(1))

val prefixedList = "forums.pragprog.com/forums/87" :: feeds
println("First feed in prefixed: " + prefixedList.head)

val appendedList = feeds :: List("agiledeveloper.com/blog")
println("Last feed in appended: " + appendedList.last)

println("Feeds with blog: " + feeds.filter( _ contains "blog" ).mkString(", "))
println("All feeds have com: " + feeds.forall( _ contains "com" ))
println("All feeds have dav: " + feeds.forall( _ contains "dave" ))
println("Any feed has dave: " + feeds.exists( _ contains "dave" ))
println("Any feed has bill: " + feeds.exists( _ contains "bill" ))

println("Feed url lengths: " + feeds.map( _.length ).mkString(", "))

val total = feeds.foldLeft(0) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total)

val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
println("Total length of feed urls: " + total2)

val total3 = (0 /: feeds) { _ + _.length }
println("Total length of feed urls: " + total3)
