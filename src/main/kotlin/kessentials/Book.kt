package kessentials
//1
const val maxBook = 10

class Book(val title:String){
    fun canBorrow(hasBorrow:Int):Boolean = hasBorrow < maxBook
    companion object{
         const val BASE_URL= "https://BookStore.com/"
    }
    fun printUrl() = println("$BASE_URL$title.html")
}
