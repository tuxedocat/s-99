package s99

object P05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case x :: xs => reverse(xs) ::: List(x)
    case _ => Nil
  }

  // foldLeft version
  //  def reverse[T](list: List[T]): List[T] = list.foldLeft(Nil: List[T])((x, y) => y :: x)
}
