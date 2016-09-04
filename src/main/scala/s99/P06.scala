package s99

object P06 {

  import P05.reverse

  def isPalindrome[T](lst: List[T]): Boolean = {
    if (lst == reverse(lst)) true else false
  }
}