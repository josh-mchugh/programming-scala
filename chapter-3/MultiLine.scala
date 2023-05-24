//Scala Strings are not like Java Strings. You can use them as you would in Java but they have additional functionality. Scala can automatically convert a String to a scala.runtime.RichString which opens up additional methods such as 'capitialize()', 'lines()', and 'reverse()'. Scala also supports multiple likes with triple quotes ("""...""").
val str = """In his famous inaugural speach, John F. Kennedy said
        "And so, my fellow Americans: ask not what your country can do
        for you-ask what you can do for your country." He then proceeded
        to speak to the citizens of the World..."""
println(str)
