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
//partition
fun partition(){
    val list =listOf(1,2,3,4,5,6,7,8,9,10)
    val (match, unMatch)=list.partition { it % 2 == 0 }
    println(match)
    println(unMatch)
}
// any, none, all
fun testFilter(){
    val list =listOf(1,2,3,4,5,6,7,8,9,10)
    println(list.any { it % 2 == 0 })
    println(list.none{ it % 2 == 0 })
    println(list.all { it % 2 == 0 } )
}


fun main() {
//    loading()
//    partition()
    testFilter()
}

