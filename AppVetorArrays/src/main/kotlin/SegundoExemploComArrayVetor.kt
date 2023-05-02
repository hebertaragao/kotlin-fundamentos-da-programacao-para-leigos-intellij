fun main() {
    val arrayElementos = Array<String>(size = 4, init = {index -> "Elemetos do Array/Vetor ($index)"})
    println("Tamanho do Array/Vetor ${arrayElementos.size}")
    println("Elemento na posição 0: ${arrayElementos.get(0)}")
    println("Elemento na posição 1: ${arrayElementos.get(1)}")
    println("Elemento na posição 2: ${arrayElementos.get(2)}")
    println("Elemento na posição 3: ${arrayElementos.get(3)}")

    arrayElementos.set(1,"Campo Grande")
    println("Elemento na posição 1: ${arrayElementos.get(1)}")
}