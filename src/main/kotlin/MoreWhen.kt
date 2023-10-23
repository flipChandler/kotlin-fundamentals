fun main() {
    val n1 = 31
    val n2 = 20

    // if else
    if (n1 >= n2 || n1 <= 30) {
        println(":)")
    } else if (n1 == 100) {
        println(":|")
    } else if (n1 == 200) {
        println(":(")
    } else {
        println(":'(")
    }

    // when
    when {
        (n1 >= n2 || n1 <= 30) -> println(":)")
        (n1 == 100) -> println(":|")
        (n1 == 200) -> println(":(")
        else -> println(":'(")
    }

    val age = 18

    when(age) {
        !in 12 .. 13 -> println("foo")
        in 13 .. 19 -> println("teenager")
        in 20 .. 100 -> println("adult")
        else -> println("bar")
    }
}