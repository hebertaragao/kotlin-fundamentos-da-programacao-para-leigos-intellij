 /**
  * Converor de medidas
  * 1 pé = 12 polegadas
  *
  * 1 jarda = 3 pés
  *
  * 1 Milha = 1,760 jardas
  *
  * Converter pés em polegadas =  pes * 12
  * Converter pés em jardas =  pes / 3
  * Converter pés em milhas = jardas / 1,760
  *
  * Outras possibilidades
  *
  * Distâncias, Peso, Velocidade
  * */
 fun main() {
     println("*** CONVERSOR DE MEDIDAS ***\n\n")
     println("Informe a quantidade de pés: ")
     var pes: Int = readLine()!!.toInt()

     var polegadas = converterEmPolegadas(pes)
     println("$pes, pés, valem $polegadas polegadas.")

     var jardas = converterPesEmJardas(pes)
     println("$pes, pés valem $jardas jardas.")

     var milhas = converterPesEmMilhas(jardas)
     println("$pes, pes valem $milhas milhas.")
 }

 // Converter em Polegadas
 fun converterEmPolegadas(pes:Int):Int{
    return pes * 12
 }
 // Converter em Jardas
 fun converterPesEmJardas(pes: Int):Double{
     return pes / 3.0
 }
 //Converter pés em milhas
 fun converterPesEmMilhas(jardas: Double): Double{
     return jardas / 1760
 }
