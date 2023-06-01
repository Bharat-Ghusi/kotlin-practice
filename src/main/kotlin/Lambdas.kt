var dirty=20
fun feedFishTimes(times:Int)= times*2 //Named function

val waterFilter0 ={dirty:Int -> dirty*4} //Lambda function
val waterFilter: (Int) -> Int ={dirty -> dirty*2} //Lambda function
//higher order function
fun cleanWater(dirty:Int, wash: (Int) -> Int  ):Int{
    return wash(dirty)
}
fun operation(){
    println(cleanWater(dirty,waterFilter))
    println(cleanWater(dirty,::feedFishTimes))
    println(cleanWater(dirty ,{dirty -> dirty*10})   )//pass as a last parameter
    println(cleanWater(dirty){dirty -> dirty*10}   )//pass as a last parameter outside of parentheses
}


fun main() {
//    { println("Hello") }()
//    val swim = { println("Swimming \n") }
//    swim()
//    val waterFilter ={item:Int -> item*2 }
//    println(waterFilter(4))
//println(waterFilter(3))
operation()



}