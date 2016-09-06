package s99

object P01 {
  def last[T](list: List[T]): T = list match {
    case x :: xs => last(xs)
    case Nil => sys.error("")
  }
}
