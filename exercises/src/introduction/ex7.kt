fun calculationMedia(n1: Double, n2: Double): Double{
    val m = (n1 + n2)/2
    return m
}

fun verificaAprovacao(m: Double): Unit{
    if(m >= 6.0){
        println("Média: $m")
        println("Aprovado!")
    }else{
        println("Média: $m")
        println("Reprovado!")
    }
}

fun main() {

    println("Vamos calcular sua média!")
    print("Nota 1: ")
    val nota1  = readln().toDouble()
    print("Nota 2: ")
    val nota2  = readln().toDouble()

    val media = calculationMedia(nota1, nota2)
    verificaAprovacao(media)

}
