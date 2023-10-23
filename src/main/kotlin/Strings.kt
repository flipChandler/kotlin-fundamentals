fun main() {
    var name = "felipe"
    println(name)
    println(name.length)    // length == property
    println(name.uppercase()) // uppercase == method
    println(name.lowercase()) // lowercase == method
    println(name[0])    //
    println(name[4])    //
    println(name.isEmpty())
    println(name.isNotBlank())

    var age = 36
    var msg = "$name, $age}"
    println(msg)

    msg = "${name.uppercase()}, ${age + 1}" // doing operations, use {} (curly brackets)
    println(msg)

    // multiline strings
    var email = """
        Hi, %s 
        I'd like to say
        that this email is in three lines
    """.trimIndent()
    println(email.format("Felipe"))     // %s will be replaced by Felipe

    // string comparison
    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = String("Saleh".toCharArray())   // new String

    println(name1 == name3)   // true
    println(name1 === name3) // false | memory content
    println(name1.equals(name3))    // true

}