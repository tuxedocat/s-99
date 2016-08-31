package s99

object P05 {
  def reverse[T](lst: List[T]): List[T] = lst match {
    case x :: xs => reverse(xs) ::: List(x)
    case _ => Nil
  }
}
