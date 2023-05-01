/**
 * Expressão IF ELSE
 */
fun main() {
    var valorA = 10
    var valorB = 20

    var i = 23

    if (i == null) {
        executarProcessamento()
    }else{
        naoExecutarProcessamento()
    }
    print("\n\nFim....")

}
fun executarProcessamento(){
    print("\n\nProcessando")
}
fun naoExecutarProcessamento(){
    print("\n\nSem processamento")
}