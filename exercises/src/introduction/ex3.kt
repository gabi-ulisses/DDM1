fun convertCelsiusToFahrenheit(c: Double): Double{
    return  32 + ((9 * c)/5)
}

fun main() {

    println("Vamos converter graus Celsius (C) para Fahrenheit (F)!")
    print("Graus Celsius (C): ")
    val celsius = readln().toDouble()

    val fahrenheit = convertCelsiusToFahrenheit(celsius)

    println("$celsius º são $fahrenheit fahrenheit.")

}
