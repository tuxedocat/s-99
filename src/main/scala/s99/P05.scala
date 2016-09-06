package s99

object P05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case x :: xs => reverse(xs) ::: List(x)
    case _ => Nil
  }
}
