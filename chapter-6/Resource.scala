//Scala provides a way to easily implement and construct 'Execute around method' pattern. In this example we create a private class and companion object which starts a transaction via the constructor, then executes a code block and follows up by cleaning up afterwards.
class Resource private() {
  println("Starting transaction...")

  private def cleanUp() { println("Ending transaction...") }

  def op1 = println("Operation 1")
  def op2 = println("Operation 2")
  def op3 = println("Operation 3")
}

object Resource {
  def use(codeBlock: Resource => Unit) {
    val resource = new Resource

    try {
      codeBlock(resource)
    } finally {
      resource.cleanUp()
    }
  }
}

Resource.use { resource =>
  resource.op1
  resource.op2
  resource.op3
  resource.op1
}
