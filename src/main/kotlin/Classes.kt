fun main() {
    val tv = SmartDevice(
        "SAMSUNG Smart Tv",
        1000.0)
//    tv.brand = "SAMSUNG Smart Tv"
//    tv.price = 1000.0
    println("${tv.brand} - ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    val phone = SmartDevice("Apple Iphone")
    phone.price = 1200.0
    println("${phone.brand} - ${phone.price}")
    phone.getDeviceState()
    println("toString")
    println(phone)

    val laptop = SmartDevice();
}

// blueprint
class SmartDevice constructor(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
) {
    constructor() : this(null, null)
    constructor(
        brand: String
    ) : this(brand, 0.0)


    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }


}