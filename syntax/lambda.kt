fun executar(x: Int, y: Int,
             op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun main() {

    val somar: (Int, Int) -> Int =                      // info: tipagem explícita: o "molde" (tipo) é definido antes e a "ação" (lambda) depois.
        { x, y -> x + y }

    val mult = { x: Int, y: Int -> x * y }              // info: Inferência de tipo: o compilador "deduz" o tipo da variável através dos parâmetros declarados dentro do lambda.

    val res = executar(5, 3, mult)
    println(res)

    /*
     * Mas, qual a vantagem de usar lamba?
     */

    // val res2 = executar(5, 3, {a, b -> a - b})
    val res2 = executar(5, 3) {
        a, b -> a - b                                   // info: quando o lambda é o ÚLTIMO PARÂMETRO não é obrigatório que ele esteja dentro dos ().
    }

    println(res2)


}
