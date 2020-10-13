val flag = true
println(if (flag) "hello" else "hi")

val result = for (i <- 1 to 5) { println("Hello") }
val result = for { i <- 1 to 5 } println("Hello")


val result = for { i <- 1 to 5 } yield println("Hello")
val result = for { i <- 1 to 5 } yield "Hello"
val result = for { i <- 1 to 5 } yield i * i

