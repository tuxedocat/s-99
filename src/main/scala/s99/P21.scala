package s99

object P21 extends App {
  val result1 = insertAt('new, 1, List('a, 'b, 'c, 'd))
  val expected1 = List('a, 'new, 'b, 'c, 'd)
  assert(result1 == expected1)

  def insertAt[T](elem: T, i: Int, l: List[T]): List[T] = l.splitAt(i) match {
    case (lhs, rhs) => lhs ::: List(elem) ::: rhs
  }
}
