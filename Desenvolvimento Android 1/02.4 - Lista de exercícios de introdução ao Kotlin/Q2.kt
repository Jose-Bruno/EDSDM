fun main() {
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca")   

    )
    
    familiaMap.forEach { (chave, valor) ->
        println("$chave: $valor")
    }
}