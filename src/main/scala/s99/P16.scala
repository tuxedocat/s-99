package s99

object P16 {

  /**
    * Drop every nth element from a list.
    * @param n nth
    * @param list
    * @tparam T
    * @return
    */
  def drop[T](n: Int, list: List[T]): List[T] = {
    val nthList = Stream.continually(1 to n).flatten.take(list.length).toList
    val result = nthList.zip(list).filter(_._1 != n).map(_._2)
    result
  }
}
