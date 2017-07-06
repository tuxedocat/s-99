package s99

object P19 extends App {
  val result1 = rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val expected1 = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  val result2 = rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  val expected2 = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  assert(result1 == expected1)
  assert(result2 == expected2)

  def rotate[T](i: Int, l: List[T]): List[T] = {
    if (i > 0) l.drop(i) ::: l.take(i)
    else if (i < 0) {
      val boundary = l.length - math.abs(i)
      l.drop(boundary) ::: l.take(boundary)
    } else l
  }
}
