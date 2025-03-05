/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    var pNumber : Double = 0.0
    var nNumber : Double = 0.0
    var zNumber : Double = 0.0
    for( i in 0 until arr.size) {
        if ( arr[i] > 0 ) {
            pNumber++
        }
        else if ( arr[i] < 0 ) {
            nNumber++
        }
        else zNumber++

    }

    var size = arr.size.toDouble()

    println("%.6f".format(pNumber/size))
    println("%.6f".format(nNumber/size))
    println("%.6f".format(zNumber/size))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
