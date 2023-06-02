package assignment


fun binarySearch(arr: Array<Int>,target:Int):Int{
var start= 0
var end= arr.size-1
     while (start <= end){
        val mid = start+(end-start)/2
        if(arr[mid] == target) return mid else if(arr[mid] > target) end =mid-1 else start= mid+1
    }
    return -1
}

fun printPatter(n:Int){
    for (i in 1..n*2){

    }





}

fun main() {
    printPatter(5)
 val arr=   arrayOf(1,2,3,4,5,6)
    println(binarySearch(arr,5))
}
