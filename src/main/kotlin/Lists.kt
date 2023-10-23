fun main() {
    // read only list
    val names: List<String> = listOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter",
        "Samira"
    )
    println(names) // [Jamila, Jamas, Saleh, Peter, Samira]
    println(names[0]) // Jamila
    println(names.contains("Samira")) // true
    println(names.first()) // Jamila
    println(names.last()) // Samira
    println(names.size) // 5
}