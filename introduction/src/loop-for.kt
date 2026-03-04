fun main() {
    //for-each
    val frutas = listOf("a", "b", "c")
    for(fruta in frutas){
        println(fruta)
    }

    // for controlado por índices
    for (i in 1 .. 10){
        println(i)
    }

    // for controlado por índices com variável
    val max = 10
    for (i in 1 .. max){
        println(i)
    }
}