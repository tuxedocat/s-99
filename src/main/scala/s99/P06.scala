package s99

object P06 {

  import P05.reverse

  def isPalindrome[T](list: List[T]): Boolean = {
    if (list == reverse(list)) true else false
  }
}