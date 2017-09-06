package s99

object P25 extends App {

  val result = randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  assert(result.length == 6)
  println(result)

  def randomPermute(symbols: List[Symbol]): List[Symbol] ={
    import P23.randomSelect
    randomSelect(symbols.length, symbols)
  }
}
