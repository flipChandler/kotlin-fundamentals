fun main() {
    greet("Felipe", 36)
    greet("Monica", 16)
    greet("Chandler")
    greet(age = 30, name = "Ramirez") // named arguments

    foo(bar = {
        println("bar as a function")
    })

    // the same function above
    foo {
        println("bar as a function 2")
    }

    foo2()

    println(double(50))
    println(double2(50))

    println(returnTwoValues()) // (Amigos, 20)
    println(returnThreeValues()) // (Amigos, 20, N)

    val (val1, val2) = returnTwoValues()
    println("$val1, $val2")

    val (val3, val4, val5) = returnThreeValues()
    println("$val3, $val4, $val5")
}

fun foo(bar: () -> Unit) {
    println("bar function")
    bar()
}

fun foo2(bar: () -> Unit = {}) { // is optional to pass bar function
    println("bar function")
    bar()
}

fun greet(name: String, age: Int = -1) { // default argument
    println("hello, $name")
    if (age == - 1) {
        println("age not provided")
    }
    if (age >= 18) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}

fun double(number: Int) : Int {
    return number * 2
}

fun double2(number: Int) = number * 2 // single expression function

// return multiple values from functions

fun returnTwoValues(): Pair<String, Int> {
    return "Amigos" to 20
}

fun returnTwoValues2(): Pair<String, Int> =
    Pair("Amigos", 20)

fun returnThreeValues(): Triple<String, Int, Char> {
    return Triple(
        "Amigos",
        20,
        'N'
    )
}
