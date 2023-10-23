fun main() {
    val letters = charArrayOf(
        'A', 'B', 'C', 'D', 'E')

    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }
    /*
    0 - A
    1 - B
    2 - C
    3 - D
    4 - E
     */

    println("reverse")
    for (index in letters.indices.reversed()) {
        println("$index - ${letters[index]}")
    }
    /*
    4 - E
    3 - D
    2 - C
    1 - B
    0 - A
     */
}