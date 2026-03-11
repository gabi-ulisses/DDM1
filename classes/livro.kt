package classes

class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    var estaEmprestado: Boolean,
){
    val descricao: String
        get(){
            val informacoes: String
            if (estaEmprestado) informacoes = "$titulo ($anoPublicacao), de $autor. Atualmente emprestado."
            else  informacoes = "$titulo ($anoPublicacao), $autor. Disponível para empréstimo."
            return informacoes
        }

    fun emprestar() {
        estaEmprestado = true
    }

    fun devolver() {
        estaEmprestado = false
    }
}

fun main() {
    val l = Livro("Dom Casmurro", "Machado de Assis", 1899, true)

    println(l.descricao)

    l.estaEmprestado = false

    println(l.descricao)

    l.emprestar()

    println("Emprestado: " + l.descricao)

    l.devolver()

    println("Devolvido: " + l.descricao)
    
}
