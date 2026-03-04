fun main(){
    var x: Int = 10                 // Declaração de variável comum
    val y: Int = 20                 // Declaração de variável inalterada
    val z = 10
    val w = 2.5

    x = z + 5                       // Sucesso: ...
    // x = w + 5                    // Erro: float + int , não é possível realizar operações com tipos de dados diferentes
    // y = 25                       // Erro: y foi declarado como variável inalterada

    val res: Double = w + 5         // Sucesso: ...


}