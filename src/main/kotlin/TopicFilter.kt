// Filter [Eager & lazy]
fun loading(){
    val color= listOf<String>("Red","Green","Blue","Black","White","Orange")
    //Eager loading
    val eager=color.filter { it[0] == 'B' }
    println(eager)
    //lazy loading
    val lazy=color.asSequence().filter { it[0] == 'B'}
    println(lazy)
    println(lazy.toList())
    val lazyMap = color.asSequence().map { println("Map: $it") }
//    println(lazyMap)
//    println(lazyMap.toList())
    println("Lazy: ${lazyMap.first()}")
}

fun main() {
    loading()
}