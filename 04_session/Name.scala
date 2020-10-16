
// default & named parameters
class Name (salutation: String = "Mr.", first: String, last: String) {
  def full() = s"$salutation, ${last.toUpperCase()}, $first"
}  

object Application {
  def main(args: Array[String]) = {
    val name = new Name(first = "Abhijay", salutation = "Mr", last = "Paliwal")
    println(name.full())
    val name2 = new Name(first = "Utpal", last = "Agrawal")
    println(name2.full())
    println("DONE")    
  }
}
