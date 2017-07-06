package s99

object P20 extends App {
  val result1 = removeAt(1, List('a, 'b, 'c, 'd))
  val expected1 = (List('a, 'c, 'd), 'b)
  assert(result1 == expected1)

  def removeAt[T](i: Int, list: List[T]): (List[T], T) = {
    val removedItem = list(i)
    val removed = list.zipWithIndex.filter(_._2 != i).map(_._1)
    (removed, removedItem)
  }
}
