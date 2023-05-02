import java.time.LocalDateTime

fun main() {
    val dataHoraAtual = getDataHoraAtual()
    println("Data e hora atual: $dataHoraAtual")
}
fun getDataHoraAtual():LocalDateTime{
    return LocalDateTime.now()
}