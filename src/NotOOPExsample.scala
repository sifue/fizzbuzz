import scala.collection.mutable

object NotOOPExample {

  def main(args: Array[String]) {
    val limit = args(0).toInt
    for (index <- 1 to limit) {
      index match {
        case i if (i % 3 == 0 && i % 5 == 0) => printlnWithCount("Fizz Buzz")
        case i if (i % 3 == 0) => printlnWithCount("Fizz")
        case i if (i % 5 == 0) => printlnWithCount("Buzz")
        case i => println(i)
      }
    }
    countMap.foreach {
      case (key, value) => println(s"$key : $value")
    }
  }

  val countMap = mutable.Map[String, Int]()

  def printlnWithCount(massage: String) = {
    println(massage)
    countMap.put(massage, countMap.getOrElse(massage, 0) + 1)
  }
}
