package s99

object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    import P09.pack
    val packed = pack(list)
    packed map ((x) => (x.length, x.head))
  }
}