/**
 * Calcular a área do triângulo
 * Área = (base * altura) / 2
 */
fun main() {
    println("Cálculo da área do triângulo")
    println("Informe a medida da base: ")
   var base: Int = readLine()!!.toInt()

    println("Informe a medida da altura: ")
    var altura: Int = readLine()!!.toInt()

    var areaDoTriangulo = calcularAreaDoTriangulo(base, altura)
    println("A área = $areaDoTriangulo")
    println("A área = ${calcularAreaDoTriangulo(5,4)}")
}

fun calcularAreaDoTriangulo(base: Int, altura: Int): Int{
    return (base * altura) / 2

}