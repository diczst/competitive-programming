package subdomain01Warmup

/*

example:
5
1000000001 1000000002 1000000003 1000000004 1000000005
return 5000000015
*/

fun main(){
    val bigNums: Array<Long> = arrayOf(1000000001,1000000002,1000000003,1000000004,1000000005)
    println(aVeryBigSum(bigNums))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum: Long = 0
    for(i in ar.indices){
        sum+=ar[i]
    }
    return sum
}