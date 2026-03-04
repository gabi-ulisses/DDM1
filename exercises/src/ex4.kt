const val pi: Double = 3.14159

fun calculationArea(r: Double): Double{
    val a = pi * (r*r)
    return  a
}

fun main() {

    println("Vamos calcular a área de um círculo!")
    print("Raio: ")
    val raio  = readln().toDouble()

    val area = calculationArea(raio)

    println("O círculo com raio $raio tem uma área de $area metros quadrados.")

}