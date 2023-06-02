package Aquarium

open class Book(title: String, author:String) {
    private var currentPage=0
    open fun readPage() = currentPage++
//    open var readPage = {currentPage++}
    override fun toString(): String {
        return "ReadPage-currentPage: $currentPage"
    }

}
class EBook(format:String ="text"): Book("Blooded max","Avilash"){
    var wordCount=0;
    override fun readPage(): Int {
        return super.readPage()
    }
    override fun toString(): String {
        return "ReadPage-wordCount: ${readPage()} "
    }
}

fun main() {
val digit=EBook()
    println(digit)
}