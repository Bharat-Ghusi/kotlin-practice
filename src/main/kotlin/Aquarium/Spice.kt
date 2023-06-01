package Aquarium

class Spice (var name:String, var spiciness: String = "mild") {
    val heat:Int get() = when(spiciness){
        "mild" -> 5
        "spicy" -> 10
        else -> 0
    }
    init {
        println("Name: $name  spiciness: $spiciness")
    }

    //helper
    fun helper(): Spice{
        return  Spice("salt")
    }

    override fun toString(): String {
        return "[ \"Name: $name  spiciness: $spiciness\" ]"
    }
}