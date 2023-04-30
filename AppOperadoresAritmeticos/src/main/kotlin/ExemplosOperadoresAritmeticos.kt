fun main() {
    var valorA = 10.0
    var valorB = 5.0
    //var soma = valorA + valorB

    var soma = valorA.plus(valorB) // calculo correto em kotlin
    var sub = valorA.minus(valorB)
    var mult = valorA.times(valorB)
    var div = valorA.div(valorB)
    var resto = valorA.mod(valorB)
    println("$soma\n $sub\n $mult\n $div\n $resto ")
}