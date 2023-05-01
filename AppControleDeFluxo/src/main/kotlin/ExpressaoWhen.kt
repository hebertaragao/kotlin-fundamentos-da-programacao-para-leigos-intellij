/**
 * Expressão When
 */
fun main() {
    var valorA = 10

    when(valorA){
        10 -> println("Valor A = 10")
        20 -> println("ValorA = 20")
        else -> {
            println("ValorA não é 10 nem é 20")
        }
    }
}