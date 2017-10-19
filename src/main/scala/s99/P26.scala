package s99

object P26 extends App {
  val expected = 20
  val result = combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  println(result)
  assert(expected == result.length)

  def combinations[A](k: Int, l: List[A]) = {
    l combinations k toList
  }
}
