/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var i = 0
    var x = 0
    var y = 0
    for(i in 0..2) {

        if( a[i] > b[i] ) {
            x++
        }
        else if ( a[i] < b[i] ) {
            y++
        }

    }
    return arrayOf(x,y)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
