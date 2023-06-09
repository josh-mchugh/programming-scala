//Scala is vigilant about the type of the object that are instaniated. It prohibits conversions that may cause typing issues. When declaring an ArrayList without a type, Scala behind the scenes assigns the type 'Nothing'. This is the cause of the error in the example when trying to assign an ArrayList[Int] to ArrayList[Nothing].
import java.util._

var list1 = new ArrayList[Int]
var list2 = new ArrayList

list2 = list1
