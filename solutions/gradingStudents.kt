/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    var copy = grades

    for ( i in copy.indices ) {
        if ( copy[i] >= 38 ){
            when {

                copy[i] % 5 == 3 -> copy[i] = copy[i] + 2
                copy[i] % 5 == 4 -> copy[i] = copy[i] + 1

            }
        }

        else {}
    }
    return grades

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
