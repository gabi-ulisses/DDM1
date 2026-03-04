fun mult1(a: Int = 1, b: Int): Int = a * b
fun mult2(a: Int, b: Int = 2): Int = a * b


fun main(){

    val res = mult1(b=3)
    println("res: $res")

    val res3 = mult2(4)
    println("res3: $res3")

    val res2 = mult1(5, 6)
    println("res2: $res2")

}