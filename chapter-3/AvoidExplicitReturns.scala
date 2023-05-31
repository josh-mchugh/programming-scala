//In Scala it is not good practice to use returns from methods. Scala sees a return and bails out of that method. It affects Scala's ability to infer the return type.
def check1() = true

def check2() : Boolean = return true
println(check1)
println(check2)
