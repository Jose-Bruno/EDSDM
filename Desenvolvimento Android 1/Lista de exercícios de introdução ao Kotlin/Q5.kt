fun processarInteiro(i: Int, operacao: (Int) -> Int): Int {
    return operacao(i)
}

fun processarInteiros(i: Int, j: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(i, j)
}

fun somar(i: Int, j: Int): Int {
    return i + j
}

fun multiplicar(i: Int, j: Int): Int {
    return i * j
}

fun calcularRaizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero) return n
    }
    return -1
}

fun main() {
    println("Chamadas Normais:")
    println(processarInteiro(10) { it * 2 }) 
    println(processarInteiros(5, 3, ::somar))
    println(processarInteiros(4, 4) { x, _ -> calcularRaizQuadrada(x) })

    println("Chamadas com Expressões Lambda:")
    println(processarInteiro(10) { num -> num * num }) 
    println(processarInteiros(5, 3) { a, b -> a - b }) 
    println(processarInteiros(9, 9) { x, y -> if (x == y) calcularRaizQuadrada(x * y) else -1 })
}