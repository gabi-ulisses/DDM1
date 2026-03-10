fun calculationIMC(p: Double, a: Double): Double{
    val imc = p / (a*a)
    return  imc
}

fun classificationIMC(imc: Double): Unit{
    if (imc < 18.5){
        println("IMC: $imc")
        println("Você está abaixo do peso.")
    }else if (imc >= 18.5 && imc <= 25.0){
        println("IMC: $imc")
        println("Você está eutrófico.")
    }else if (imc >= 25.0 && imc <= 30.0){
        println("IMC: $imc")
        println("Você está com sobrepeso.")
    }else if (imc > 30.0){
        println("IMC: $imc")
        println("Você está com obesidade.")
    }
}

fun main() {

    println("Vamos calcular seu IMC!")
    print("Peso: ")
    val peso  = readln().toDouble()
    print("Altura (em metros): ")
    val altura  = readln().toDouble()

    val imc = calculationIMC(peso, altura)

    classificationIMC(imc);

}
