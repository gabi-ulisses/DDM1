fun convertMetrosToMilimetros(m: Double): Double{
    return m * 1000
}
fun main() {

    println("Vamos converter um valor em metros para milímetros!")
    print("Metros: ")
    val metros = readln().toDouble()

    val milimetros = convertMetrosToMilimetros(metros)

    println("$metros metros são $milimetros milímetros.")

}
