//Example of using the Execute Around Method pattern or Loan pattern. This example uses the PrintWriter to write to the file. The user of the 'writeToFile' method does not have to worry about closing the file.
import java.io._

def writeToFile(fileName: String)(codeBlock: PrintWriter => Unit) = {
  val writer = new PrintWriter(new File(fileName))
  try {
    codeBlock(writer)
  } finally {
    writer.close()
  }
}

writeToFile("output.txt") { writer =>
  writer write "hello from Scala"
}
