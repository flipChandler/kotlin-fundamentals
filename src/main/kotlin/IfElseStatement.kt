fun main() {
    val number1 = 10
    val number2 = 20

    if (number1 > number2) {
        println(":)")
    } else if (number1 == 100) {
        println(":|")
    } else {
        println(":(")
    }

    // if expression
    val value = if (number1 > number2) {
        ":)"
    } else if (number1 == 100) {
        ":|"
    } else {
        ":("
    }

    println(value)

    // ternary
    val result = if (number1 < number2) ":)" else ":("
    println(result)

    val result2 =
        if (number1 < number2) ":)"
        else if (number1 == 100) ":|"
        else   ":("

    println(result2)
}