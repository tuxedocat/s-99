package s99

object P07 {
  def flatten(lst: List[Any]): List[Any] = lst flatMap {
    case l: List[_] => flatten(l)
    case x => List(x)
  }
}