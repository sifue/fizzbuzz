object OOPExample extends App {
  val limit = args(0).toInt
  for (index <- 1 to limit) {
    PrintCountingFizzBuzzFinder.find(index).printMessage
  }
  PrintCountingFizzBuzzFinder.fizz.printCount
  PrintCountingFizzBuzzFinder.buzz.printCount
  PrintCountingFizzBuzzFinder.fizzBuzz.printCount
}

object PrintCountingFizzBuzzFinder {
  val fizz = new Fizz
  val buzz = new Buzz
  val fizzBuzz = new FizzBuzz

  def find(order: Int): FizzBuzzTerm = {
    order match {
      case o if (o % 3 == 0 && o % 5 == 0) => fizzBuzz
      case o if (o % 3 == 0) => fizz
      case o if (o % 5 == 0) => buzz
      case o => new Number(o)
    }
  }
}

trait FizzBuzzTerm {
  private var countOfPrintMessage = 0
  def message: String
  def printMessage = {
    println(message)
    countOfPrintMessage += 1
  }
  def printCount = println(s"$message : $countOfPrintMessage")
}

class Fizz extends FizzBuzzTerm { def message = "Fizz"}

class Buzz extends FizzBuzzTerm { def message = "Buzz"}

class FizzBuzz extends FizzBuzzTerm { def message = "Fizz Buzz"}

class Number(val number: Int) extends FizzBuzzTerm { def message = number.toString }