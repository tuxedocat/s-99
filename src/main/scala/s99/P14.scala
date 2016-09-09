package s99

object P14 {
  def duplicate[T](list: List[T]): List[T] = list match {
    case Nil => list
    case x :: xs => x :: x :: duplicate(xs)
  }
}