fun main() {
    println("range")
    for (i in 1..5) {
        println(i)
    }

    println("downTo")
    for (i in 5 downTo 1) {
        println(i)
    }

    println("step")
    for (i in 1..10 step 2) {
        println(i)
    }

    println("downTo and step")
    for (i in 5 downTo 1 step 2) {
        println(i)
    }
}