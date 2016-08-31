package s99

object P04 {
  def length[T](lst: List[T]): Int = {
    def inner(l: List[T], c: Int): Int = l match {
      case (x :: xs) => inner(xs, c + 1)
      case (x :: Nil) => c
      case _ => c
    }
    inner(lst, 0)
  }
}