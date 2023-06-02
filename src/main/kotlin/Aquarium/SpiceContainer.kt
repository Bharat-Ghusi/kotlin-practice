package Aquarium


data class SpiceContainer(val spice:Spice){
    val label=spice.name
}

fun main() {
    val contaier= listOf(SpiceContainer(Spice("Curry","mild")),
        SpiceContainer(Spice("Chicken","Spicy")),
        SpiceContainer(Spice("Kadi","sweet"))  )

    println(contaier)
}