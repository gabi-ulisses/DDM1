fun main() {
    val i = 10

    val mensagem = StringBuilder()          // info: criação de instância do StringBuilder
    
    mensagem.append("Valor de i = ")        // info: adicionando partes do texto (pode ser encadeado)
        .append(i)
        .append(".\n")                      // info: adiciona uma nova linha
        .append("O dobro de i é ")
        .append(i * 2)

    println(mensagem.toString())            // info: converte para String ao imprimir
}
