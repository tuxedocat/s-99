package s99

object P27 extends App {
  import P26.combinations
  val expected = List(
    List(List("Aldo", "Beat"),
         List("Carla", "David", "Evi"),
         List("Flip", "Gary", "Hugo", "Ida")))
  val result1 = group3(
    List("Aldo",
         "Beat",
         "Carla",
         "David",
         "Evi",
         "Flip",
         "Gary",
         "Hugo",
         "Ida"))
  val result2 = group3(
    List("Aldo",
         "Beat",
         "Carla",
         "David",
         "Evi",
         "Flip",
         "Gary",
         "Hugo",
         "Ida"))
  println(result1)
  println(result2)
//  assert(expected.take(3) == result)

  def group3[A](l: List[A]): List[List[List[A]]] =
    combinations(2, l).flatMap { c2 =>
      combinations(3, l.diff(c2)) map { c3 =>
        List(c2, c3, l.diff(c2 ::: c3))
      }
    }

  def group[A](sizes: List[Int], l: List[A]): List[List[List[A]]] = {
    assert(sizes.sum != l.size)
    sizes match {
      case Nil => List(Nil)
      case h :: t =>
        combinations(h, l).flatMap(cs => group(t, l.diff(cs)) map { cs :: _ })
    }
  }
}
