package inerf

import kotlin.math.PI

interface Car {
    val wheel:Int
    val engine:String
    val name:String

    fun start():Boolean
    fun brake(brakeType:String="drum"):String{
      return "$name have $brakeType brake."
    }
}
class Toyota(override val wheel: Int,
             override val engine: String,
            override val name:String ):Car{
    override fun start(): Boolean {
        println("Toyota $name started.")
        return true
    }



    override fun toString(): String {
        return "[Toyota $name have $wheel wheel and $engine engine.]"
    }

}

fun main() {
    val toyota= Toyota(4,"2.5L","Fortuner")
    println(toyota)
    println(toyota.brake("Disk"))
}

