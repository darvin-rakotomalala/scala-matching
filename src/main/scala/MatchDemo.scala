class MatchDemo {

  // Use match on parameter id and return a String.
  // ... Default case returns "None" String.
  def colorCode(id: Int): String = id match {
    case 0 => "Blue"
    case 1 => "Red"
    case 2 => "Green"
    case _ => "None"
  }

  // Return true if list has two or more elements.
  //     Second element must be greater than the first.
  // ... Return false for all other lists.
  def testList(x: List[Int]): Boolean = x match {
    case a :: b :: c => b > a
    case _ => false
  }

  // Return Some or None option based on integer.
  def getOption(n: Int): Option[Int] = if (n >= 1) Some(n) else None

  def ifInsideMatchCase(): Unit = {
    val magnitude = 5

    // Match on magnitude, returning a string.
    // ... Handle greater than or equal to 4.
    //     Handle less than or equal to 1.
    val result = magnitude match {
      case m if m >= 4 => "Big, greater than or equal to 4"
      case m if m <= 1 => "Small, less than or equal to 1"
      case _ => "Medium"
    }
    println(result)
  }

}
