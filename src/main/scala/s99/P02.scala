package s99

object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case x :: xs => penultimate(xs)
    case _ => sys.error("")
  }
}