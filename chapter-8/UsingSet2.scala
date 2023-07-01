//Scala Set collection allows us to easily filter, merge, intersect, map, and iterator over the collection with it's useful functions. It's easy to complete these operations in one line of code.
val feed1 = Set(
  "blog.toolshed.com",
  "pragdav.pragprog.com",
  "pragmactic-osxer.blogspot.com",
  "vita-contemplativa.blogspot.com",
)
val feed2 = Set(
  "blog.toolshed.com",
  "martinfowler.com/bliki"
)

// only update select feeds from feeds1 on Blogspot
// Example of: filter()
val blogSpotFeeds = feed1 filter ( _ contains "blogspot" )
println("blogspot feeds: " + blogSpotFeeds.mkString(", "))

// merge the two feeds into one
// Example of: ++()
val mergedFeeds = feed1 ++ feed2
println("# of merged feeds: " + mergedFeeds.size)

// compare two feeds with intersect
// Example of: **()
val commonFeeds = feed1 & feed2
println("common feeds: " + commonFeeds.mkString(", "))

// modify feed1 by prefixing it with 'https://'
// Example of: map()
val urls = feed1 map ( "https://" + _ )
println("One url: " + urls.toList(0))

// Iterating over the sets can be done with a build in iterator
// Example of: foreach
println("Refresh Feeds:");
feed1 foreach { feed => println("  Refreshing " + feed ) }
