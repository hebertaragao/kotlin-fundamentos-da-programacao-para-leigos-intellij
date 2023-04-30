fun main() {
    var valorA: String = "Brasília"
    var valorB: String = "Brasília"
    var valorC: String = "Brasília"

    var comparacao1 = (valorA.equals(valorB) && (valorA.equals(valorC)))
    println(comparacao1)

    var comparacao2 = (valorA.equals(valorB)|| (valorA.equals(valorC)))
    println(comparacao2)

    var comparacao3 = (valorA.equals(valorB)!=(valorA.equals(valorC)))
    println(comparacao3)
}