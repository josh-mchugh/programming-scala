//If you are the author of the collection, it is ok for a collection of derived to be treated as a collection of base. You can allow this by marking your parameterized typed as '+T' instead of 'T'. '+T' tells Scala to allow covariance and accept the tpye or its base type.
class MyList[+T] //...

var list1 = new MyList[Int]
var list2 : MyList[Any] = null

list2 = list1 //OK
