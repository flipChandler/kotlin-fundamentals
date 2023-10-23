fun main() {
    val names = arrayOf("Felipe", "Eva", "Monica", "Joey", "Chandler")
    println(names.contentToString())
    println(names[0])
    println(names[1])
    names[3] = "Samira"
    println(names.contentToString())
    println(names.size)

    if ("Felipe" in names) {
        println("found")
    } else {
        println("not found")
    }

    // array of nulls

    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "Harry"
    println(arrayOfNulls.contentToString()) // [Harry, null, null, null, null]
    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString()) // [*, *, *, *, *]
}