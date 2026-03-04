fun calculationTabuada(n: Int){
    for(i in 0 .. 10){
        val res = n * i;
        println("$n * $i = $res")
    }
}

fun main() {

    println("Vamos calcular a tabuada de um número!")
    print("Número: ")
    val num  = readln().toInt()

    println("Tabuada do $num:")
    calculationTabuada(num)

}