fun main() {
    val tv1 = SmartDevice(
        "SAMSUNG Smart Tv",
        1000.0)
    val tv2 = SmartDevice(
        "SAMSUNG Smart Tv",
        1000.0)

    val tv3 = tv1

    println(tv1 == tv2) // tv1 is on the same place of memory of tv 2 ? false // if not override the equals and hashcode
    println("=== (memory location) ${tv1 === tv2}") // tv1 is the same reference of tv 2 ? false
    println(tv1 == tv3) // tv1 is on the same place of memory of tv 3 ? true
}