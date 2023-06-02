package kessentials

fun main() {
    val allBooks= setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")

    val library= mapOf("William Shakespeare" to allBooks)
    println(library.any{(key,value) -> value.contains("Hamlet")})

    var moreBooks = mutableMapOf("William Shakespeare" to "Macbeth")
    println( moreBooks.getOrPut("William Shakespeare",{"Cool"}) )
    println( moreBooks.getOrPut("Rabindranath Tagore",{"Tragedies"}) )
    println(moreBooks)


}