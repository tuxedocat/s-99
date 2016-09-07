package s99

object P11 {
  def encodeModified[T](list: List[T]): List[Any] = {
    import P09.pack
    val packed = pack(list)
    packed map { (x) => if (x.length == 1) x.head else (x.length, x.head) }
  }
}
