package s99

object P22 extends App {
  val result1 = range(4, 9)
  val expected1 = List(4, 5, 6, 7, 8, 9)
  assert(result1 == expected1)

  def numgen(start: Int): Stream[Int] =
    Stream.cons(start, numgen(start + 1))

  def range(start: Int, end: Int): List[Int] =
    numgen(start).take(end - start + 1).toList
}
