package s99

object P24 extends App {

  val result1 = lotto(6, 49)
  assert(result1.count(x => x <= 49 && x >= 1) == 6)

  def lotto(i: Int, M: Int): List[Int] = {
    val r = new scala.util.Random(1234)
    def f(l: List[Int]): List[Int] =
      if (l.length >= i) l
      else {
        val ri_ = r.nextInt(M)
        val ri = if (ri_ > 0) ri_ else 1
        l match {
          case Nil => f(List(ri))
          case _ =>
            f(l ::: List(ri))
        }
      }
    f(List())
  }
}
