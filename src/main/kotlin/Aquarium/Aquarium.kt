package Aquarium

open class Aquarium (var width:Int = 6, var height:Int = 9, var lenght:Int =9, optionalValue:Int=8){

    //same as property
    open var volume: Int
        get() = width * height * lenght / 1000
        set(value) {
            height += width + lenght
        }
    var size: Int = 5
    open var water= volume * 9.0
    init {
        if(optionalValue > size) size=optionalValue //Optional value can be used many ways
        println("Inside init(), setting fish size")
    }
    //Secondary constructor
    constructor( isPet: Boolean):this(10,10,10,20)



//    val volume: Int get() {
//    return width * height * lenght /1000
//    }
//    fun volume(): Int= width * height * lenght /1000

}

