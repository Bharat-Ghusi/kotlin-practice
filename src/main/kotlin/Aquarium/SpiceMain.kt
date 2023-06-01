package Aquarium

fun getSpiceDetails(){
    val spices= SimpleSpice()
    println("Name: ${spices.name} spiceness: ${spices.heat} " )
}

//Practice time
fun getSpice(){
  val  spice  = listOf<Spice>(Spice("curry", "mild"),
        Spice("chicken","spicy"),
        Spice("Egg","spicy"),
        Spice("paneer","sweet"))

//    Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
    var spicyFoods= spice.filter { it -> it.heat in 6..11 }
    println(spicyFoods)

}
fun main() {
//getSpiceDetails()
//    getSpice()
    getSpice()
//    println(sp)



}

