package s99

object P01{
  def last[T](lst:List[T]):T = lst match {
    case (x::xs) => last(xs)
    case (x::Nil) => x
    case Nil => sys.error("")
  }
}
