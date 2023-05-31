fun whatShouldIDoToday(mood: String="happy", weather:String="sunny",temperature:Int = 24, ):String{
return when{
   condition1(mood,weather,temperature) -> "go for a walk."
     condition2(mood,weather)  -> "go for a ride."
     condition3(temperature)   -> "go swimming"
    else -> "Stay home and read."
}
}
fun condition1(mood:String, weather:String="sunny",temperature:Int ) = mood == "happy" && weather == "cold" && temperature <=10
fun condition3(temperature:Int ) = temperature > 35
fun condition2(mood:String, weather:String ) = mood == "sad" && weather == "any"
////Compact function
//fun shouldChangeWater(day:String, temp: Int=30 ,clean:Int=20):Boolean{
//return when{
//    temp < 10 -> true
//    clean > 70 -> true
//    day == "sunday"->true
//    else -> false
//}
//}
//Compact function
//fun shouldChangeWater(day:String, temp: Int=30 ,clean:Int=20):Boolean{
//    val isHot= temp < 10
//    val isClean= clean > 70
//    val isSunday= day == "sunday"
//
//return when{
//    isHot-> true
//    isClean -> true
//    isSunday->true
//    else -> false
//}
//}
//Compact function
fun shouldChangeWater(day:String, temp: Int=30 ,clean:Int=20):Boolean{
return when{
    isHot(temp)-> true
    isClean(clean) -> true
    isSunday(day)->true
    else -> false
}
}
//Compact function
fun isHot(temp:Int)=temp < 10
fun isClean(clean:Int) = clean > 70
fun isSunday(day:String)= day == "sunday"


fun main() {
//println(whatShouldIDoToday("sad","any",45))
//println(whatShouldIDoToday(readlnOrNull().toString(),"any",45))
println(whatShouldIDoToday("happy","cold",4))
//    println("You should ${if(shouldChangeWater("sunday",50,20)) "not change" else " change" } water.")
}
