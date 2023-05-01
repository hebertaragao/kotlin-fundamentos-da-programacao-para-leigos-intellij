fun main() {
    val numero = 1
    val saidaFormatada = String.format("%04d", numero)
    val soma = saidaFormatada + saidaFormatada // correto converter para int por ex: saidaFormatada.toInt()

    println("Número $numero")
    println("Padrão de Formatação $saidaFormatada")
    println("Soma: $soma")
}