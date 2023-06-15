//Scala allows you to create functions within functions and assign them to references and pass them around to other functions. Scala function values are really objects as Scala internally creating them as instances of special classes. 
def totalResultOverRange(number: Int, codeBlock: Int => Int) : Int = {
  var result = 0
  for(i <- 1 to number) {
    result += codeBlock(i)
  }

  result
}

println(totalResultOverRange(11, i => i))
println(totalResultOverRange(11, i => if (i % 2 == 0) 1 else 0))
println(totalResultOverRange(11, i => if (i % 2 != 0) 1 else 0))
