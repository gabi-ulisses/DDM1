fun maior(a: Int, b: Int): Int {

    if(a > b) {
        return a
    } else {
        return b
    }

}

fun maior2(a: Int, b: Int) =
    if(a > b) {
        a
    } else {
        b
    }

fun maior3(a: Int, b: Int) = if (a > b) a else b         // Info: Idêntico ao operador ternário, de Java

fun main() {
    val res = maior(2, 10)
    println("Maior: $res")

    val x = 10
    val paridade = if (x % 2 == 0) "par" else "ímpar"   // Info: Idêntico ao operador ternário, de Java
    println("Paridade $paridade")

}