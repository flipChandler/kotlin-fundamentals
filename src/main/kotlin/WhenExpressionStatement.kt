fun main() {
    val input = "Ff"

    val gender = when(input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> {
            "Unknown gender"
        }
    }

    println(gender)
}