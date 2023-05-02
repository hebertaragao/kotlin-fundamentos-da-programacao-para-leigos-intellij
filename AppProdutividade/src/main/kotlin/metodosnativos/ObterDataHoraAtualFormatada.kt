import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val dataHoraAtual = getDataHoraAtualFormatada()
    println("Data e hora atual: $dataHoraAtual")
}
fun getDataHoraAtualFormatada():String{

    val dataHoraAtual = LocalDateTime.now()

    val dataFormatada = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")

    val saidaFormatada  = dataHoraAtual.format(dataFormatada)
    return saidaFormatada.toString()
}