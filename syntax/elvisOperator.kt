fun main() {

    // val endereco = "Rua Dois"
    // val endereco = null                  // Tipo: Nothing? (tipo que só aceita null)
    val endereco: String? = null            // Tipo explícito: String (permite métodos de String após check)

    /* O operador Elvis (?:) verifica: se 'endereco' não for null, usa ele.
    * Se for null (que é o caso atual), utiliza a String "desconhecido".
    */
    val rua = endereco ?: "desconhecido"

    println(rua)
}
