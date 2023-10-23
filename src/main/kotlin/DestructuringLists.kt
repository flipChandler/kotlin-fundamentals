fun main() {
    // read only list
    val names: List<String> = listOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter",
        "Samira"
    )

    val (one, two, three) = names
    println("$one, $two, $three") // Jamila, Jamas, Saleh

    val (um, dois, _, quatro) = names // _ means skip
    println("$um, $dois, $quatro") // Jamila, Jamas, Peter
}