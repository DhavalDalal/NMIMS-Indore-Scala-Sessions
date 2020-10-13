// Multiple Assignments

// val (i, j, k) = ("Hello", 10d, 'C')
//
// println(i)
// println(j)
// println(k)

def swap(i: Int, j: Int) = (j, i)

val (x, y) = swap(10, 20)

println(x)
println(y)