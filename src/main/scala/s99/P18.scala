package s99

object P18 extends App {
  val result = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val expected = List('d, 'e, 'f, 'g)
  assert(result == expected)

  def slice[T](i: Int, j: Int, list: List[T]):List[T] = list.drop(i).take(j - i)
}
