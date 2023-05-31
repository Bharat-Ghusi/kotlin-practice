import java.util.Calendar
import java.util.Date
import java.util.Random
import java.util.Scanner
import kotlin.time.Duration.Companion.days

fun dayOfWeek() {
    println("What day it is today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Try again")
    }
}

fun feedTheFish() {
    val day = getFeedDay()
    val food = getFood(day)
    println("Today is $day and the fish will eat $food")
}

fun getFeedDay(): String {
    val week = listOf<String>("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun getFood(day: String): String {
    return when (day) {
        "Sunday" -> "Egg"
        "Monday" -> "Chicken"
        "Tuesday" -> "vegetable"
        "Thursday" -> "Aalu"
        "Friday" -> "Soya"
        else -> "Bhuke so jao"
    }
}

//Quiz
fun getFortuneCookie(birthday:()->Int): String{
    val fortunes= listOf<String>("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday:")
//    val birthday = readlnOrNull()?.toIntOrNull() ?:1
//    return fortunes[birthday()/fortunes.size]
    var day=birthday()
    return when(day){
        1  -> fortunes[0]
        20 -> fortunes[1]
        30 -> fortunes[2]
        10 -> fortunes[3]
        5 -> fortunes[4]
        25 -> fortunes[5]
        25 -> fortunes[6]
        else -> {fortunes[day/fortunes.size]}
    }
}
//Function: parameter, default args, named parameter
fun shouldChangedWater(day: String,temp:Int=30,clean:Int=40): Boolean{
    return clean > 40
}

//Fit fish more
fun canAddFishMore(gallons:Double ,aqua:List<Int> ,newFishLength:Int=0, hasDecoration:Boolean=true): Boolean{
    if (hasDecoration &&  aqua.sum()+newFishLength <= (80.0/100)*gallons){
        return true;
    }
    else if (!hasDecoration && aqua.sum()+newFishLength <= gallons){
        return true
    }
    else return  false
}

fun main(args: Array<String>) {
//    println("Hello good morning! ${args[0]}") //Taken args from main function
//             dayOfWeek()
    //Every thing in Kotlin is expression and has value, Even Unit has value
//    val temp = 20
//    val isHot = if (temp > 70) true else false
//    println(isHot)
//    println("Fish is ${if(temp > 50) "fried" else  " normal" }")

//    println("${if(args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, kotlin" }")
//    feedTheFish()
//    do {
//    var str=getFortuneCookie()
//        println(str)
//        var i=0
//
//    }
//        while (i++ < 10 && str != "Take it easy and enjoy life!")
//    feedTheFish()//
//    practice Quiz
//
//    var fortune:String;
//    run repeatBloc@{  // need to make a label outside of the repeat!
//        repeat(10) {
//            fortune = getFortuneCookie { readlnOrNull()?.toIntOrNull() ?: 1 }
//            println("Your fortune is $fortune")
//            if (fortune.contains("Take it easy")) return@repeatBloc
//        }
//    }
    var fortune:String;
        for(i in 1..10) {
            fortune = getFortuneCookie { readlnOrNull()?.toIntOrNull() ?: 1 }
            println("Your fortune is $fortune")
            if (fortune.contains("Take it easy")) break
        }

//println(shouldChangedWater(getFeedDay()))
//println(shouldChangedWater(getFeedDay(), temp = 34))
//println(shouldChangedWater(getFeedDay(), clean = 60))
//if (shouldChangedWater(getFeedDay(),50,20 )) println("No need to change water") else  println("Change the water")
//println(canAddFishMore(10.0, listOf(), 7, true  ))

}

