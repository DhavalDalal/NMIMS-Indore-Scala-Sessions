import java.util.*;

class TuplesAndMultipleAssignments {
  public static List<Integer> swap(int i, int j) {
    return List.of(j, i);
  }
  
  public static void main(String[] args) {
    var i = 10;
    var j = 20;
    var result = swap(10, 20);
    System.out.println(result.get(0));
    System.out.println(result.get(1));
    System.out.println("DONE");
  }
}