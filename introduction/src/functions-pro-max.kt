
/*
        Tipo "Unit" indica que não haverá valor de retorno
        é como o void, de Java.
        O Unit pode ser omitido nas declaração da função.
 */

fun printRes(res: Int): Unit{       // Info: Tipo Unit declarado
    println("Res: $res")
}

fun useless(x: Int){                // Info: Tipo Unit omitido
    println(x)
}

fun main(){
    val x = 2 + 3
    printRes(x)
}