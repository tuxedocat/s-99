package s99

object P28 extends App {
  val result1 = lsort(
    List(List('a, 'b, 'c),
         List('d, 'e),
         List('f, 'g, 'h),
         List('d, 'e),
         List('i, 'j, 'k, 'l),
         List('m, 'n),
         List('o)))
  val expected1 = List(List('o),
                       List('d, 'e),
                       List('d, 'e),
                       List('m, 'n),
                       List('a, 'b, 'c),
                       List('f, 'g, 'h),
                       List('i, 'j, 'k, 'l))
  val result2 = lsortFreq(
    List(List('a, 'b, 'c),
         List('d, 'e),
         List('f, 'g, 'h),
         List('d, 'e),
         List('i, 'j, 'k, 'l),
         List('m, 'n),
         List('o)))
  val expected2 = List(List('i, 'j, 'k, 'l),
                       List('o),
                       List('a, 'b, 'c),
                       List('f, 'g, 'h),
                       List('d, 'e),
                       List('d, 'e),
                       List('m, 'n))
  println(result1)
  println(result2)
  assert(expected1 == result1)
  assert(expected2 == result2)

  def lsort[A](ll: List[List[A]]): List[List[A]] = {
    ll sortBy (_.size)
  }

  def lsortFreq[A](ll: List[List[A]]) = {
    val freqs = ll.foldLeft(Map[Int, Int]()) { (m, l) =>
      m + (l.size -> (m.getOrElse(l.size, 1) + 1))
    }
    ll.sortBy(l => freqs(l.size))
  }
}

