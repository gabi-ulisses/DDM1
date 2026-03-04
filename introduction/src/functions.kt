fun somar(a: Int, b: Int): Int{
    return a + b
}

fun mult(a: Int, b: Int): Int = a * b

fun main(){

    var a = 1;
    var b = 2;

    val soma = somar(a, b)
    println("$a + $b = $soma")

    val mult = mult(a, b)
    println("$a * $b = $mult")

    val res = mult1(b=3)
    println("res: $res")

    val res2 = mult1(5, 6)
    println("res2: $res2")

}

