//Scala procide Extractors for pattern matching. Extractors extract matching parts from the input. They allow you to match arbitrary patterns. Leveraging the 'unapply' method, and return as many matching parts as you desire.
object StockService {
  def process(input: String) {
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
      case ReceiveStockPrice(symbol @ Symbol(), price) => printf("Received price %f for symbol %s\n", price, symbol)
      case _ => println("Invalid input " + input)
    }
  }
}

object Symbol {
  def unapply(symbol: String) : Boolean = symbol == "GOOG" || symbol == "IBM"
}

object ReceiveStockPrice {
  def unapply(input: String) : Option[(String, Double)] = {
    try {
      if (input.contains(":")) {
        val splitQuote = input.split(":")
        Some(splitQuote(0), splitQuote(1).toDouble)
      } else {
        None
      }
    } catch {
      case _ : NumberFormatException => None
    }
  }
}

StockService.process("GOOG")
StockService.process("GOOG:310.84")
StockService.process("GOOG:BUY")
StockService.process("IBM")
StockService.process("ERR")
StockService.process("ERR:12.21")
