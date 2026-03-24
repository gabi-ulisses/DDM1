/* 
 * introduction: Herança em Kotlin permite que uma classe herde características de outra.
 * Por padrão, as classes são "fechadas" (final), por isso usamos a palavra 'open'
 * para permitir que outras classes as estendam e sobrescrevam seus comportamentos.
 */

package herancas

open class Animal {                     // info: classe 'open' permite ser herdada por outras
    fun sayHello() =
        println("Eu sou um animal.")    // info: sem 'open', este método não pode ser sobrescrito

    open fun eat() =                    // info: método 'open' permite que a subclasse mude o comportamento
        println("Animal comendo.")
}

class Cavalo : Animal() {               // info: Cavalo estende Animal
    override fun eat() =                // info: 'override' indica que estamos redesenhando o método da classe pai "Animal"
        println("Cavalo pastando.")
}
