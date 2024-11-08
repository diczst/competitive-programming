package subdomain01Warmup

/*

Example

a = [1, 2, 3]
b = [3, 2, 1]

For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second

*/

fun main(){
    val alice: Array<Int> = arrayOf(5,2,3) // 1
    val bob: Array<Int> = arrayOf(4,2,5) //2
    println(compareTriplets(alice,bob).joinToString(" "))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aliceScore = 0
    var bobScore = 0
    for (i in a.indices){
        if(a[i] != b[i]){
            if(a[i] > b[i]){
                aliceScore++
            } else {
                bobScore++
            }
        }

    }
    return arrayOf(aliceScore,bobScore)
}