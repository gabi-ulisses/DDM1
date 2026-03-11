package classes

class Pessoa(                                           // info: Classe em Kotlin, equivale a classe PessoaJava
    val nome: String,
    var estudante: Boolean
) {
    fun saudacao() {                                    // info: metodo da classe Pessoa
        println("Oi! Meu nome é $nome.")
        val papel = if(estudante) "sou" else "não sou"
        println("Eu $papel estudante.")
    }
}

fun main() {

    val p = Pessoa("Gabrielle", true)

    println("Nome: " + p.nome)                          // info: p.nome -> em Kotlin não é necessário chamar o metodo get. da classe Java
    println("Estudante: " + p.estudante)

    p.estudante = false
    println("Estudante: " + p.estudante)

    // p.nome = "Maria"                                 // erro: o atributo nome foi declarado como VAL, tornando-o imutável.

    p.saudacao()
}

