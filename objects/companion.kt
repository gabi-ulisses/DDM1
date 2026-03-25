/* 
 * introduction: O 'companion object' é um objeto vinculado à classe, funcionando 
 * como uma alternativa aos membros 'static' do Java. Ele permite chamar métodos 
 * e acessar propriedades diretamente pelo nome da classe, sem criar uma instância.
 */

package objects

class MyClass {
    // info: o 'companion object' pode ser anônimo (sem nome) ou ter um nome opcional
    companion object {                      // info: object sem nome dentro da classe
        fun callMe() =
            println("Objeto companheiro.")
    }
}

fun main() {
    // info: Chamada direta pelo nome da classe, sem usar parênteses '()' pois não é uma instância
    MyClass.callMe()
}
