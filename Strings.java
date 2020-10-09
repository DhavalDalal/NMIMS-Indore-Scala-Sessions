class Strings {
  public static void main(String[] args) {
    var str = "Hello";
    var name = "Prachi";
    System.out.println(str + " " + name + "!");
    System.out.println(String.format("%s %s!", str, name));
    
    var paragraph = "Strings in Scala\n" +
      "  - Multi-line\n" +
      "  - Interpolation\n" +
      "Tuples and Multiple Assignments in Scala\n";
    System.out.println(paragraph);
  }
}