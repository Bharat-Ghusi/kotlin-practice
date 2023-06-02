package Aquarium
//Object class [Singleton class]
object Twilight{
    val author="Stephenie Meyer"

}
//Enum
enum class Color(rgb:String){
    RED("#43290"),
    GREEN("#43290"),
    BLUE("#43290"),
    YELLOW("#43452");

    fun printColor(){
        println("Chosen color is $this")
    }

}
//Seal class [When a class is declared as seal, it can be sub-classible with in the file only.]
//By declaring seal we restrict the types
sealed class Tile
class Red(val shade:String, val point:Int): Tile()
class Blue(val shade:String): Tile()
class Yellow(val shade:String,val point: Int): Tile()


fun main() {
 val tile:Tile = Red("Pink",34)
    val point= when (tile){
        is Red -> tile.point *3
        is Blue -> tile.shade
        is Yellow -> tile.point*6
    }
}
