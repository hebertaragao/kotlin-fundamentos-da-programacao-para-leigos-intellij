fun main() {
    val primeiroNumero = 10
    val segundoNumero: Int = 10
    var soma = somarDoisNumeros(primeiroNumero, segundoNumero)
    imprimirSoma(primeiroNumero, segundoNumero, soma)

    imprimirSoma( 25, 20, somarDoisNumeros(25, 20))
}

private fun imprimirSoma(primeiroNumero: Int, segundoNumero: Int, soma: Int) {
    println("1º número: $primeiroNumero")
    println("2º número: $segundoNumero")
    println("A soma é: $soma")
}

fun somarDoisNumeros(primeiroNumero: Int, segundoNumero: Int): Int {
    return primeiroNumero + segundoNumero
}