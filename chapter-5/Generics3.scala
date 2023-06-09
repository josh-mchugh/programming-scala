//We can alter the default behavior in Scala to allow assignment of Generics with the type 'Any'. 'Any' is the base type for all types in Scala. Scala does not allow by defaulting assigning a collection of arbitrary type to a reference of a collection of 'Any' type. Scala does a llow us to assign variable references of Int type to an Any type. It will not allow us to assign ArrayList[Int] to Arraylist[Any].
import java.util._

var list1 = new ArrayList[Int]
var list2 = new ArrayList[Any]

var ref1: Int = 1
var ref2: Any = null

ref2 = ref1

list2 = list1
