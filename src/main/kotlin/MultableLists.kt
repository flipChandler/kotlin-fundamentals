fun main() {
    val names = mutableListOf(
        "Jamila",
        "Sonia",
        "Dimitri",
        "Lilith",
        "Brandon"
    )
    names.add("Harry")
    println(names) // [Jamila, Sonia, Dimitri, Lilith, Brandon, Harry]
    names.remove("Brandon") // [Jamila, Sonia, Dimitri, Lilith, Harry]
    println(names)
    println(names.indexOf("Dimitri")) // 2

    val setNames = mutableSetOf(
        "Jamila",
        "Sonia",
        "Dimitri",
        "Lilith",
        "Brandon"
    )

    println(setNames)
    setNames.add("George")
    println(setNames) // [Jamila, Sonia, Dimitri, Lilith, Brandon, George]
    setNames.add("George")
    println(setNames) // // [Jamila, Sonia, Dimitri, Lilith, Brandon, George]
}
