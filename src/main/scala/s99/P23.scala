package s99

object P23 extends App {

  import P20.{removeAt => removeAt}

  val result1 = randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  val expected1 = 3
  assert(result1.length == expected1)

  def randomSelect(i: Int, symbols: List[Symbol]): List[Symbol] = {
    val r = new scala.util.Random(1234)
    def f(l: List[Symbol]): List[Symbol] = {
      if (l.length == i) l
      else
        l match {
          case Nil => l
          case _ =>
            val id = r.nextInt(l.length)
            val (removed, _) = removeAt(id, l)
            f(removed)
        }
    }
    f(symbols)
  }
}
