package inerf

import Aquarium.Color

sealed class Spice (open var name:String , open var spiciness: String="mild" ) : Grinder{
    val heat:Int get() = when(spiciness){
        "mild" -> 5
        "spicy" -> 10
        else -> 0
    }
    abstract fun prepareSpice()


    init {
        println("Name: $name  spiciness: $spiciness")
    }

    //helper

    override fun toString(): String {
        return "[ \"Name: $name  spiciness: $spiciness\" ]"
    }
}
//Grinder
interface Grinder{
    fun grind()
}
//Spice color
interface SpiceColor{
    val color: Color
}
//Singleton class
object YellowSpiceColor:SpiceColor{
    override val color: Color
        get() = Color.BLUE
}

//Curry
class Curry(override var name:String, override var spiciness:String, var color:SpiceColor=YellowSpiceColor): Spice(name,spiciness), Grinder{
    override fun prepareSpice() {
        println("Preparing ${this.name}")
    }

    override fun grind() {
        println("Grinding $name .")
    }

}

fun main() {
    var curry= Curry("Chicken curry","spicy")
    println(curry.prepareSpice())
    println(curry.color.color)

}