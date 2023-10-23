const val PI = 3.14 // out of the function | == static final

fun main() {
    var intNumber: Int = 10
    var longNumber: Long = 100L
    var doubleNumber: Double = 3.14
    var floatNumber: Float = 3.14F
    var booleanVariable: Boolean = false
    var stringVariable: String = "Amigoscode"
    var charVariable: Char = 'A';
    var anyVariable: Any = 10;
    anyVariable = "Store any thing"
    println(PI)

    var intInferedVariable = 10;
    var stringInferedVariable = "Felipe"

    val cantChangeThisVariable = "Felipe" // immutable | read only | == final
    // cantChangeThisVariable = "Something else"

    // null safety
    var brand: String? = "Amigoscode" // brand can be null because of '?'
    brand = null;

    var brand2: String? = null // can be null

    // stringVariable = null can't be null | doesn't have '?'
}