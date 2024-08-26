fun <T> aplicarOperacao(a: T, b: T, operacao: (T, T) -> T): T {
    return operacao(a, b)
}

fun main() {
    println(aplicarOperacao(2, 3) { x, y -> x + y })
    println(aplicarOperacao("Jo", "ão") { x, y -> x + y })
}

fun soma(i: Int, j: Int) = i + j

fun concatenar(i: String, j: String): String = "$i$j"