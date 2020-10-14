class Name {
  private final String salutation;
  private final String first;
  private final String last;
  
  Name(String salutation, String first, String last) {
    this.salutation = salutation;
    this.first = first;
    this.last = last;
  }
  
  public String full() {
    return String.format("%s. %s, %s", salutation, last.toUpperCase(), first);
  }
  
  public String getLast() {
    return last;
  }
  
  public String getFirst() {
    return first;
  }
  
  public static void main(String[] args) {
    var name = new Name("Mr", "Abhijay", "Paliwal");
    System.out.println(name.full()); // Mr. PALIWAL, Abhijay
    System.out.println(name.getLast());
    System.out.println(name.getFirst());
    System.out.println("DONE");
  }
}

// Decompiler
// Compiled from "Name.java"
// class Name {
//   private final java.lang.String salutation;
//   private final java.lang.String first;
//   private final java.lang.String last;
//   Name(java.lang.String, java.lang.String, java.lang.String);
//   public java.lang.String full();
//   public java.lang.String getLast();
//   public java.lang.String getFirst();
//   public static void main(java.lang.String[]);
// }
