//Scala has special classes called 'case classes' which are used in pattern matching. Case classes allow for classes to be pattern matched with the information in the classes.
abstract case class Trade()
case class Sell(stockSymbol: String, quantity: Int)
case class Buy(stockSymbol: String, quantity: Int)
case class Hedge(stockSymbol: String, quantity: Int)

class TradeProcessor {
  def processTransaction(request: Any) {
    request match {
      case Sell(stock, 1000) => println("Selling 1000-units of " + stock)
      case Sell(stock, quantity) => printf("Selling %d units of %s\n", quantity, stock)
      case Buy(stock, quantity) if(quantity > 2000) => printf("Buying %d (large) units of %s\n", quantity, stock)
      case Buy(stock, quantity) => printf("Buying %d units of %s\n", quantity, stock)
    }
  }
}

val tradeProcessor = new TradeProcessor
tradeProcessor.processTransaction(Sell("GOOG", 500))
tradeProcessor.processTransaction(Buy("GOOG", 700))
tradeProcessor.processTransaction(Sell("GOOG", 1000))
tradeProcessor.processTransaction(Buy("GOOG", 3000))
