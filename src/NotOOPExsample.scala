object NotOOPExample extends App {
  val limit = args(0).toInt
  var countFizzBuzz = 0
  var countFizz = 0
  var countBuzz = 0

  for (index <- 1 to limit) {
    index match {
      case i if (i % 3 == 0 && i % 5 == 0) =>
        println("Fizz Buzz")
        countFizzBuzz += 1
      case i if (i % 3 == 0) =>
        println("Fizz")
        countFizz += 1
      case i if (i % 5 == 0) =>
        println("Buzz")
        countBuzz += 1
      case i => println(i)
    }
  }

  println(s"Fizz : $countFizz")
  println(s"Buzz : $countBuzz")
  println(s"FizzBuzz : $countFizzBuzz")
}
