import java.util.stream.Collectors

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    //1
    println(spices.sortedBy { it.length })
    println(spices.sortedByDescending { it.length })
    //2
   println( spices.filter { it[0] == 'c' && it[it.length-1] == 'e' })
    println(spices.filter { it.startsWith('c')  && it.endsWith('e')}   )

    //3
    println(spices.take(3).filter { it.startsWith('c') })

}