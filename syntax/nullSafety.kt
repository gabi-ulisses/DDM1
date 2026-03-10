fun main() {
    val s1: String = "hello"
    println(s1.uppercase())

    val s2: String? = null          // String? = permite que a variável seja nula
    println(s2?.uppercase())        // s2?. = safe call (chamada segura) que pode ser usada para "desampacotar" dados

    val s3: String? = null
    println(s3!!.uppercase())       // s3!!. =  lança uma exceção (NullPointerException) se o valor for nulo

}
