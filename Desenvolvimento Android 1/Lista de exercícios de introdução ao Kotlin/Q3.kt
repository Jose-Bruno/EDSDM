fun aplicarOperacaoInt(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a, b)
}

fun aplicarOperacaoString(a: String, b: String, operacao: (String, String) -> String): String {
    return operacao(a, b)
}

fun main() {
    println(aplicarOperacaoInt(10, 20) { x, y -> x + y })
    println(aplicarOperacaoString("Ped", "ro") { x, y -> x + y })
}

fun soma(i: Int, j: Int) = i + j

fun concatenar(i: String, j: String): String = "$i$j"