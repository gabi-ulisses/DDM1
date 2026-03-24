/* 
 * introduction: Construtores Secundários são definidos dentro do corpo da classe usando
 * a palavra 'constructor'. Eles são úteis quando você precisa de lógicas de
 * inicialização alternativas ou quando a classe não possui um construtor primário.
 */


package construtores.secundario

class Customer {
    var name: String                // info: propriedade declarada no corpo da classe

    constructor(name: String?) {    // info: 1º construtor secundário (aceita String ou null)
        this.name = name ?: "Joe"
    }

    constructor() {                 // info: 2º construtor secundário (sem argumentos)
        this.name = "Mary"          // info: define um valor fixo padrão para chamadas vazias
    }
}

fun main() {
    val customers = listOf(
        Customer("Moe"),
        Customer("Larry"),
        Customer("Curly"),
        Customer(null),              // info: cai no 1º construtor (resultado: "Joe")
        Customer()                   // info: cai no 2º construtor (resultado: "Mary")
    )

    for (c in customers) {
        println(c.name)
    }
}
