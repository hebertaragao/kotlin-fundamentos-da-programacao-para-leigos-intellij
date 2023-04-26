/**
 * Este programa responderá a pergunta abaixo:
 * Como calcular quantos anos de vida uma
 * pessoa tem
 */
fun main() {
    //CamelCase Java Python Koltin
    //Entrada de Dados
    var anoDeNascimento = 2000
    var anoAtual = 2021

    // Processamento
    var resultadoDoCalculo = calcularAnosDeVida(anoDeNascimento, anoAtual)

    // Saída
    imprimirResultados(anoDeNascimento, anoAtual, resultadoDoCalculo)
}
fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento
    return anosDeVida
}
fun imprimirResultados(anoDeNascimento: Int, anoAtual: Int, resultadoDoCalculo: Int) {

    print("Como calcular quantos anos de vida uma pessoa tem\n")
    print("Ano de nascimento: $anoDeNascimento\n")
    print("Ano Atual........: $anoAtual\n\n")
    print("você têm ${resultadoDoCalculo} anos de vida!")
}