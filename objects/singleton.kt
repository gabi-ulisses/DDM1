/* 
 * introduction: O modificador 'object' em Kotlin cria um Singleton. Isso significa 
 * que a classe é instanciada apenas uma vez e de forma automática pelo Kotlin, 
 * servindo como um ponto único de acesso para dados e comportamentos globais.
 */

package objects

data class Employee(
    val name: String,
    val salary: Double
)

object Payroll {                                                    // info: declara classe e objeto ao mesmo tempo (Singleton)
    val allEmployees = mutableListOf<Employee>()                    // info: 'mutableListOf' permite que a lista seja modificada (add/remove) após sua criação

    fun calculateSalary(): Double =
        allEmployees
            .map { e -> e.salary }
            .sum()                                                  // info: soma todos os salários da lista
}

fun main() {
    Payroll.allEmployees.add(Employee("Moe", 100.0))    // info: acesso diretamente pelo nome do objeto, sem usar 'val p = Payroll()'
    Payroll.allEmployees.add(Employee("Larry", 150.0))

    val total = Payroll.calculateSalary()

    println("Total da Folha: $total")                               // info: Resultado: 250.0
}
