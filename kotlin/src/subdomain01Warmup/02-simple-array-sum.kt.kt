package subdomain01Warmup


/*
    example : ar = [1,2,3]. 1+2+3 = 6, so return 6
*/

fun main(){
    val arr: Array<Int> = arrayOf(1,2,3,4,5)
    val arrSum = simpleArraySum(arr)
    println(arrSum)
}

fun simpleArraySum(arr: Array<Int>): Int{
    var sum = 0
    for (element in arr){
        sum+=element
    }
    return sum
}
