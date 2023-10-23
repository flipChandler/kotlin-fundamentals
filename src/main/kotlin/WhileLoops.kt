fun main() {
    var index = 1
    while(index <= 5) {
        println("Index $index")
        ++index
    }

    println()
    val brand = "Amigoscode"
    index = brand.length - 1 // 9
    while(index >= 0) {
        println("Index ${brand[index]}")
        --index
    }

    val brandArray = arrayOf("A", "M", "I", "G", "O")
    index = 0
    while(index <= brandArray.size - 1) {
        println(brandArray[index])
        ++index
    }
}