/* 
 * introduction: Modificadores de visibilidade controlam o acesso a classes, objetos e métodos.
 * Em Kotlin, 'private' restringe o acesso apenas ao escopo da própria classe,
 * protegendo os dados e garantindo o encapsulamento.
 */

package visibilidades

class Robot {
    // info: padrão '_' para a variável privada que armazena o estado interno
    private var _model = "T800"

    // info: é mais utilizado Properties (val) do que funções de "get" (fun getModel) para expor/acessar dados
    // fun getModel() = _model

    val model: String
        get() = _model

    private fun act() {             // info: este método só pode ser chamado internamente pela classe Robot
        println("I'll be back.")
    }
}

fun main() {
    val terminator = Robot()        // info: sendo "instânciado" o objeto Robot - Em Kotlin não se usa a palavra-chave 'new'

    // terminator._model            // info: Erro! O campo com '_' é privado e inacessível aqui

    println(terminator.model)       // info: Acesso via propriedade pública (chama o 'get' por baixo dos panos)
}
