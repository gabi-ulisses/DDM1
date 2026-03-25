/*
 * introduction: Data Classes são usadas para classes que apenas armazenam dados.
 * O Kotlin gera automaticamente funções úteis como toString(), equals(), hashCode()
 * e copy(), tornando o código muito mais limpo e menos verboso.
 */

package dataclasses

data class Customer(
    val name: String,
    val postalCode: String
)

fun main() {
    val c = Customer(
        "João",
        "14806-000"
    )

    // info: O toString() gerado automaticamente imprime os dados de forma legível
    println(c) // Resultado: Customer(name=João, postalCode=14806-000)

    // info: Exemplo de copy() - cria um novo objeto alterando apenas o que você quiser
    val c2 = c.copy(name = "Maria")
    println(c2)
}
