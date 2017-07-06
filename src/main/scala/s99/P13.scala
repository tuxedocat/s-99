package s99

import P09.pack

object P13 extends App {
  val testData = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  val expected = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  val result = encodeDirect(testData)
  println(result)
  assert(result == expected)

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    val result = for (sublist <- pack(list)) yield (sublist.length, sublist.head)
    result
  }
}
