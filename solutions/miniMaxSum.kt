/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {

    val sum = arr.map { it.toLong() }.sum()

    val minSum = sum - (arr.maxOrNull() ?: 0)
    val maxSum = sum - (arr.minOrNull() ?: 0)

    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
