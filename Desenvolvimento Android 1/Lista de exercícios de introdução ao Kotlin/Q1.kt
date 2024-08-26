fun main() {
    val cursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desenvolvimento de Sistemas",
        "Técnico em Informática para Internet",
        "Manutenção de Aeronaves",
        "Técnico em Células",
        "Processos Gerenciais"
    )
    filtrarECursosComSistemas(cursos)
}

fun filtrarECursosComSistemas(cursos: List<String>) {
    val cursosComSistemas = cursos.filter { it.contains("Sistemas", ignoreCase = true) }
    cursosComSistemas.forEachIndexed { index, curso ->
        println("$index - $curso")
    }
}
