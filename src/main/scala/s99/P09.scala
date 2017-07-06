package s99

object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, rest) = list.span((x => x == list.head))
      if (rest == Nil) List(packed)
      else packed :: pack(rest)
    }
  }
}
