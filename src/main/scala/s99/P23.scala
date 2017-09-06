package s99

object P23 extends App {

  import P20.{removeAt => removeAt}

  val result1 = randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  val expected1 = 3
  assert(result1.length == expected1)
  println(result1)
  println(randomSelect(7, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

  def randomSelect(i: Int, symbols: List[Symbol]): List[Symbol] = {
    val r = new scala.util.Random()
    def f(i: Int, l: List[Symbol]): List[Symbol] = {
      if (i <= 0) Nil
      else {
        val (rest, elem) = removeAt(r.nextInt(l.length), l)
        elem :: f(i - 1, rest)
      }
    }
    f(i, symbols)
  }
}
