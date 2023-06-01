package Aquarium

class TowerTank ():  Aquarium(){

    override var volume: Int
        get() = height * width * lenght/20
        set(value) {}
    override var water: Double
        get() = volume *8.0
        set(value) {}

    override fun toString(): String {
        return "Volume: $volume \n" +
                "height $height"
    }
}

