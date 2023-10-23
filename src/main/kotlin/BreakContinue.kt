fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (number in numbers) {
        if (number == 3) break
        println(number)
    } // 1, 2

    println()

    for (number in numbers) {
        if (number % 2 == 0) continue
        println(number)
    } // 1, 3, 5, 7, 9
}