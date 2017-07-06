package s99

object P15 {

  /**
    Duplicates elements in a list N times.
  **/
  def duplicateN[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => list
    case x :: xs => {
      val head = { for (i <- 1 to n) yield x }.toList
      head ::: duplicateN(n, xs)
    }
  }
}
