fun main() {
    // ++ and --
    var number = 10
    println(number++) // 10
    println(number) // 11
    println(++number) // 12

    println(number--) // 12
    println(number) // 11
    println(--number) // 10

    //convert to int
    val number10 = "10"
    println(10 + number10.toInt()) // 20

    // convert to string
    println("10$number10") // 1010
}