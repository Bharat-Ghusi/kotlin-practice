import kotlin.random.Random
fun test(){
    val random1 = Random.nextInt() //Return random number
    val random2 = { Random.nextInt() } //Store a lambda function [Lambda function has no param and calls the random()]
    println(random1)
    println(random2)
    println(random2())
    /*
    random1 has a value assigned at compile time, and the value never changes when the variable is accessed.

random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.
     */
}
//Practice Time: Lambdas
val rollDice2:(Int)->Int = {sides -> if(sides == 0) 0 else Random.nextInt(2,12)} //function type notation
val rollDice1 ={sides:Int -> if(sides == 0) 0 else Random.nextInt(2,12) } //Lambda
//2:Practice Time: Extra Questions
fun gamePlay(roll:(Int)->Int){
    println( roll(4) )
}

fun main() {
gamePlay(rollDice2)
}