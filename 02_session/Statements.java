// Encourage Mutation
class Statements {
  public static String greetConditionally(boolean flag) {
    if (flag) 
      return "hello"; 
    else 
      return "hi";
  }
  
  public static void main(String[] args) {
    var flag = true;
    // var result = "";
    // if (flag)
    //   result = "hello";
    // else
    //   result = "hi";

    var result = greetConditionally(flag);
    System.out.println(result);
        
    for (var i = 0; i < 5; i++ ) {
      System.out.println("Hello");
    }
    System.out.println("DONE");
  }
}