val str = "Hello";
val name = "Prachi";
// println(str + " " + name + "!")
// println(String.format("%s %s!", str, name))

// String Interpolation
var greet = s"$str $name!"
println(greet)


val paragraph = 
"""
 |Strings in Scala
 |  Multi-line
 |  Interpolation
 |Tuples and Multiple Assignments in Scala
""".stripMargin

println(paragraph)

