/* 
 * introduction: O Construtor Primário é declarado diretamente no cabeçalho da classe.
 * Ele pode tanto declarar propriedades (usando val/var) quanto apenas receber
 * parâmetros temporários para repassar a outras classes ou blocos de inicialização.
 */

package construtores.primario

open class Button(val label: String)                    // info: 'val' aqui cria uma propriedade que será herdada

class RadioButton(label: String) : Button(label)        // info: aqui 'label' é apenas um parâmetro (sem var/val), pois ele apenas repassa o valor para o construtor de Button


fun main() {
    val btn = RadioButton("Ativado")               // info: instanciando e passando o valor para o construtor
    println(btn.label)                                  // info: acessando a propriedade 'label' definida na classe pai (Button)
}
