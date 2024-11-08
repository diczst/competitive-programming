package subdomain04Sorting


/*
introTutorial has the following parameter(s):

int arr[n]: a sorted array of integers
int V: an integer to search for
Returns

int: the index of  in introTutorial has the following parameter(s):

int arr[n]: a sorted array of integers
int V: an integer to search for
Returns

int: the index of V in arr
*/

fun main(){
    val nums: Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    println(introTutorial(4,nums))
}

fun introTutorial(V: Int, arr: Array<Int>): Int {
    var index = 0
    for(i in arr.indices){
        if(arr[i] == V){
            index = i
        }
    }
    return index
}