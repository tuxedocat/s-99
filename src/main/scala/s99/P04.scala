package s99

object P04 {
  def length[T](list: List[T]): Int = {
    def inner(l: List[T], c: Int): Int = l match {
      case x :: xs => inner(xs, c + 1)
      case _ => c
    }
    inner(list, 0)
  }
}