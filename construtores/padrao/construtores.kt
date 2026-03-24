/* 
 * introduction: O Construtor Padrão é um construtor primário sem parâmetros. 
 * Se nenhum construtor for declarado explicitamente, o Kotlin gera um
 * construtor vazio automaticamente para permitir a instanciação da classe.
 */

package construtores.padrao

open class Button                                    // info: possui um construtor padrão vazio implícito

class RadioButton : Button()                         // info: chama o construtor vazio da classe pai usando '()'

fun main() {
    val btn = RadioButton()                          // info: instanciando sem passar argumentos
}
