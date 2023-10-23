fun main() {
    val names = listOf("Mary", "Ali", "Alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (name in names) {
        name.replaceFirstChar {
            it.uppercase()
        }
    }

    println(names)

    numbers.forEach { number -> println(number) }

    val lista = numbers.map {
        it.times(2)
    }.toList();
    println(lista) // [2, 4, 6, 8, 10]
}