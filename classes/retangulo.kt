package classes

class Retangulo (
    val largura: Int,
    val altura: Int,
) {
    val isSquare: Boolean
        get(){                                  // info: getter personalizado
            return largura == altura            // info: syntax feia
        }

    val area: Int
        get(){
            return largura * altura
        }
    }

fun main() {
    val r1 = Retangulo(10,20)
    val r2 = Retangulo(10,10)

    println("r1: " + r1.isSquare)
    println("area r1: " + r1.area)
    println("r2: " + r2.isSquare)
    println("area r2: " + r2.area)

}
