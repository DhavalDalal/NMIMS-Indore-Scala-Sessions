class Customer {
  // public String toString() {
  //   return "Customer";
  // }
}

class Equality {
  public static void main(String[] args) {
    // primitives - value-based
    var i = 10;
    var j = 10;
    System.out.println(i == j);

    // references - identity-based
    var str1 = "Hello";
    var str2 = "Hello";
    System.out.println(str1 == str2);
    var str3 = new String("Hello");
    System.out.println(str1 == str3);
    System.out.println(str2 == str3);
    System.out.println(str1.equals(str3));
    System.out.println(str2.equals(str3));

    var c = new Customer();
    System.out.println(c == c);
    System.out.println("DONE");
  }
}