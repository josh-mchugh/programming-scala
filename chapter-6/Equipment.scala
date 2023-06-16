//Scala let you define full functions within other functions. In our example we pass the function into two different instances. This way if the function changes we do not have to change it in two different places. This way we eliminate duplicate code.  Scala allows for good design principles and code quality.
class Equipment(val routine : Int => Int) {
  def simulate(input: Int) = {
    print("Running simulation...")
    routine(input)
  }
}

def calculator(input: Int) = { println("calc with " + input); input }
val equipment1 = new Equipment(calculator)
val equipment2 = new Equipment(calculator)

equipment1.simulate(4)
equipment2.simulate(6)
