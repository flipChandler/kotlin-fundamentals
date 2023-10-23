fun main() {
    val isAdult = false
    val isMale = true
    var isOrderCompleted: Boolean? = null

    println(isAdult)
    println(isMale)
    println(isOrderCompleted)

    println(isAdult && isMale) // false
    println(isAdult || isMale) // true
    // println(isAdult || isOrderCompleted) // doesn't compile

    println(!isMale) // false
    println(!(isAdult && isMale)) // true

}