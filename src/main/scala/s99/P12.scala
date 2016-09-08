package s99

object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    //    val len = list.foldLeft((0, 0)) { case ((acci, x), (i, y)) => (i, y) }._1
    //    val result = List(len)
    //    then procedural code comes... but didn't work
    list flatMap { case (n, x) => List.fill(n)(x) }
  }
}
