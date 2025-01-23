@main
def main(): Unit =
  println("-----------------------------------------------------------------------")
  println("Hello world! This is a Scala program to illustrate the pattern matching")

  println("An example use match on parameter: ")
  val result = new MatchDemo()
  // Get color code for this argument.
  println(result.colorCode(0))
  println(result.colorCode(1))
  println(result.colorCode(4000))

  println("List pattern matching: ")
  // Call testList.
  val result1 = result.testList(List(10, 20, 30))
  val result2 = result.testList(List(20, 10))
  val result3 = result.testList(List())
  val result4 = result.testList(List(1, 0, 2, 3))
  val result5 = result.testList(List(0, 1, 2, 3))

  println(result1)
  println(result2)
  println(result3)
  println(result4)
  println(result5)

  println("Options. An option can be evaluated in match statement.")
  // Get an option.
  val resultOpt = result.getOption(2)
  // Match option on Some and None.
  resultOpt match {
    case Some(x) => println("Value exists")
    case None => println("Nothing exists")
  }

  println("If inside match case. ")
  result.ifInsideMatchCase()

