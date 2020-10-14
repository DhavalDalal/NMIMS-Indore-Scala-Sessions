class Name (salutation: String, first: String, last: String) {
  def full() = s"$salutation, ${last.toUpperCase()}, $first"
}  

object Application {
  def main(args: Array[String]) = {
    val name = new Name("Mr", "Abhijay", "Paliwal")
    println(name.full()) // Mr. PALIWAL, Abhijay
    // println(name.last)
    // println(name.first)
    // name.first = "Test"
    // println(name.full()) // Mr. PALIWAL, Test
    // name.first_$eq("Tester")
    // println(name.full()) // Mr. PALIWAL, Tester
    println("DONE")    
  }
}

// val - Decompiler
// javap -private Name.class
// Compiled from "Name.scala"
// public class Name {
//   private final java.lang.String salutation;
//   private final java.lang.String first;
//   private final java.lang.String last;
//   public java.lang.String salutation();
//   public java.lang.String first();
//   public java.lang.String last();
//   public java.lang.String full();
//   public Name(java.lang.String, java.lang.String, java.lang.String);
// }


// var - Decompiler
// javap -private Name.class
// Compiled from "Name.scala"
// public class Name {
//   private java.lang.String salutation;
//   private java.lang.String first;
//   private java.lang.String last;
//   public java.lang.String salutation();
//   public void salutation_$eq(java.lang.String);
//   public java.lang.String first();
//   public void first_$eq(java.lang.String);
//   public java.lang.String last();
//   public void last_$eq(java.lang.String);
//   public java.lang.String full();
//   public Name(java.lang.String, java.lang.String, java.lang.String);
// }

// Neither val or var - Decompiler
// javap -private Name.class
// Compiled from "Name.scala"
// public class Name {
//   private final java.lang.String salutation;
//   private final java.lang.String first;
//   private final java.lang.String last;
//   public java.lang.String full();
//   public Name(java.lang.String, java.lang.String, java.lang.String);
// }