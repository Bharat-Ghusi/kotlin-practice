package Aquarium

data class Decoration(val rock: String)
data class Decoration1(val rock: String, val sand:String)

fun main() {
    val deco1=Decoration("Sea rocks")
    val deco2=Decoration1("Sea rocks","Sea sand")
    println(deco1)
    println(deco2)
    val (rock,sand)=Decoration1("Sea rocks","Sea sand")
    println("Aquarium has $rock, $sand as decoration.")

    val deco3=Decoration1("Sea rocks","Sea sand")
    println(deco3.equals(deco2))
    val deco4=deco2.copy()
    println(deco4 === deco2)
    println(deco4.equals(deco2)) // equals() and ==  both have same functionality.
}