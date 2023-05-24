//Scala multi line strings allows for emedded quotes within the String. Multi line strings also takes indentations literally. We can use a RichString method called 'stripMargin' to remove all the blank or control characters before the leading pipe (|).
val str = """In his famous inaugural speech, John F. Kennedy said
        |"And so, my fellow Americans: ask not what your country can do
        |for you-ask what you can do for your country." He then proceeded
        |to speak to the citizens of the World...""".stripMargin
println(str)
