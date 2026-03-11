package classes

class Retangulo (
    val largura: Int,
    val altura: Int
) {
    val isSquare: Boolean
        get(){                                  // info: getter personalizado
            return largura == altura            // info: syntax feia
        }
}

fun main() {
    val r1 = Retangulo(10,20)
    val r2 = Retangulo(10,10)

    println("r1: " + r1.isSquare)
    println("r2: " + r2.isSquare)

}
