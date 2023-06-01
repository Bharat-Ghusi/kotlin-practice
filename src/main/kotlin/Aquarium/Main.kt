package Aquarium

fun buildAquarium() {
    val aquarium = Aquarium(10,20,20,40)
    println(aquarium.width)
    println(aquarium.height)
    println(aquarium.lenght)
    aquarium.height=100
    println("Changed height: ${aquarium.height}")
    println("Volume: ${aquarium.volume}")
    aquarium.volume =530
    println("Volume Changed: ${aquarium.volume}")
    println("Changed height: ${aquarium.height}")
}

fun main(args: Array<String>){
buildAquarium()
}