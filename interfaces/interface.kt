/* 
 * introduction: Em Kotlin, interfaces podem conter declarações de métodos abstratos e também
 * implementações de métodos padrão (com corpo). Diferente da herança de classes (open), 
 * uma classe pode implementar múltiplas interfaces, promovendo o polimorfismo.
 */

package interfaces

interface Clickable {
    fun click()                     // info: método abstrato (sem corpo), implementação obrigatória
    fun show() {                    // info: método com implementação padrão, sobrescrita opcional
        println("hello")
    }
}

class Button : Clickable {          // info: implementação de interface
    override fun click() {          // info: para implementar/sobrescrever método de interface o 'override' é obrigatório em Kotlin
        println("Clique detectado")
    }

    // info: não é necessário implementar o método show(), pois ele já possui comportamento padrão na interface
}

fun fireEvent(o: Clickable) {
    o.click()
}

fun main() {
    val btn = Button()              // info: sendo "instânciado" o objeto Button - em Kotlin não se usa a palavra-chave 'new'

    btn.click()                     // info: chamada direta através da instância

    fireEvent(btn)                  // info: exemplo de polimorfismo: passando o objeto para quem espera a interface

    btn.show()                      // info: chamando o método herdado com implementação padrão
}
