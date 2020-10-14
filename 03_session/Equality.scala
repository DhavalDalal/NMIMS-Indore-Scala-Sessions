class Customer

val i = 10
val j = 10
println(i == j)

val str1 = "Hello"
val str2 = "Hello"
println(str1 == str2)
var str3 = new String("Hello")
println(str1 == str3)
println(str2 == str3)
println(str1.eq(str3))
println(str2.eq(str3))
var c = new Customer
println(c == c)
println("DONE")