fun main() {

    var variavelA = "programação"
    var variavelB = "Kotlin"
    imprimir(variavelA,variavelB)
    imprimir(variavelB,variavelA)
    }
/**
 * método sempre usa-se verbo dentro dos () colocamos parâmetros se necessário,
 * e precisa declarar qual tipo é a ou as variáveis.
  */
fun imprimir(variavelA : String, variavelB : String){
    //programação
    println("$variavelA $variavelB\n")
    //println("Programação\nKotlin\n")  \n pula uma linha
    //print("Programação\t\tKotlin")  \t - tabula espaçamento

}