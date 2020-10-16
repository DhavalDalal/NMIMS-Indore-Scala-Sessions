object StringUtils {
  def विलोम(str: String) = str.reverse
  def isPalindrome(str: String) = विलोम(str).equals(str)
}

import StringUtils._

var str = "hello";
println(विलोम(str)); // ol
println(isPalindrome(str))
println(isPalindrome("नमन"))
println("DONE")