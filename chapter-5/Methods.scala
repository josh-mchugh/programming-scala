//Scala tries to infer the return type of methods. It depends on how youd define your methods. If you define a method with an equal sign, then Scala will infer the return type. Otherwise, it assumes the method is a void method.
def printMethodInfo(methodName: String) {
  println("The return type of " + methodName + " is "
            + getClass().getDeclaredMethod(methodName).getReturnType().getName())
}

def method1() { 6 }
def method2() = { 6 }
def method3() = 6
def method4 : Double  = 6

printMethodInfo("method1")
printMethodInfo("method2")
printMethodInfo("method3")
printMethodInfo("method4")
