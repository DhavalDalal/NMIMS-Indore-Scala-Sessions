class Thali(name: String) {
  override def toString() = s"$name Thali"
}

// Currying
def lunch(customer: String)(implicit thali: Thali) = 
  s"$customer having $thali"


def duringFestival() = {
  val regularThali = new Thali("Regular")
  implicit val feast = new Thali("Festival")
  // implicit val limitedThali = new Thali("Limited")

  println(lunch("Dhaval")(regularThali))  
  println(lunch("Prachi"))  
  println(lunch("Utpal"))  
}

duringFestival()