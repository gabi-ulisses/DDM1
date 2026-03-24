/* 
 * introduction: Construtores Secundários são definidos dentro do corpo da classe usando
 * a palavra 'constructor'. Eles são úteis quando você precisa de lógicas de
 * inicialização alternativas ou quando a classe não possui um construtor primário.
 */

package construtores.secundario

class Customer {
    var name: String                // info: propriedade declarada no corpo da classe (precisa ser inicializada)

    constructor(name: String?) {    // info: construtor secundário que aceita um valor nulo
        this.name = name ?: "Joe"   // info: operador Elvis (?:) garante um valor padrão caso seja null
    }
}

fun main() {
    val customers = listOf(
        Customer("Moe"),
        Customer("Larry"),
        Customer("Curly"),
        Customer(null)              // info: chamando o construtor secundário com null
    )

    for (c in customers) {
        println(c.name)             // info: imprimirá os nomes ou "Joe" para o caso nulo
    }
}
