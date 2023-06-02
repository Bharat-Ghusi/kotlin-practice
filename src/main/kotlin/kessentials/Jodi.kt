package kessentials
fun getName():Triple<String,String,String> = Triple("Bharat","Chandra","Ghusi")
fun main() {
    //Pair
    val p1 = "Avilash" to "Ghusi"
    val p2 = ("Avilash" to "Ghusi") to ("Bharat" to "Ghusi")//Nested pair
    val p3 = Pair("India",91)//Another way
    //Triple
    val t1= Triple("Bharat","Chandra","Ghusi")

    println(getName())
}
