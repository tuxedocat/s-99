package s99

object P08 {
  def compress[T](list: List[T]): List[T] = {
    list.foldRight(List[T]()) {
      (head: T, rest: List[T]) => if (!rest.isEmpty || rest.head == head) rest else head :: rest
    }
  }
}
