class StringUtils {
  
  private StringUtils() {
    
  }
  
  public static String विलोम(String str) {
    var reversed = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed.append(str.charAt(i));
    }
    return reversed.toString();
  }
  
  public static boolean isPalindrome(String str) {
    return विलोम(str).equals(str);
  }
}

public class Runner {
  public static void main(String[] args) {
    // var str = "ABLE WAS I ERE I SAW ELBA";
    var str = "hello";
    System.out.println(StringUtils.विलोम(str)); // olleh
    System.out.println(StringUtils.isPalindrome(str));  
    System.out.println(StringUtils.isPalindrome("नमन"));  
    System.out.println("DONE");
  }
}