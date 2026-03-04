fun main() {
    val idade = 17

    when{
        idade < 13  -> println("Criança")
        idade < 18  -> println("Adolescente")
        else        -> println("Adulto")
    }
}