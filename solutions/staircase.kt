/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

    for (i in 0 until n) {

        for ( j in 1 until n - i ) {

            print(" ")

        }

        println( "#" .repeat(i + 1) )

    }

}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
