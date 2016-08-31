package s99

object P02 {
  def penultimate[T](lst:List[T]):T = lst match {
    case (x::y::Nil) => x
    case (x::xs) => penultimate(xs)
    case _ => sys.error("")
  }
}