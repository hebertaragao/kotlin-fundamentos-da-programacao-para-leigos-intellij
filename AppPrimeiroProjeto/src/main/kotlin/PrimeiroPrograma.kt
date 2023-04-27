fun main(){
    // Meu primeiro programa
    print("Primeiro programa em kotlin...")

    println("Qual o seu nome? ")
    var nome: String = readLine()!!.toString()

    println("Olá! $nome. Muito prazer!")

    println("Qual sua idade? ")
    var idade: Int = readLine()!!.toInt()
    println("Sua idade é: $idade.")
}