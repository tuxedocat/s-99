package s99

object P17 {
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = {
    val fst = list.take(n)
    val rest = list.drop(n)
    (fst, rest)
  }
}
