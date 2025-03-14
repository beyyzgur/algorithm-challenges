/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    var copyOfGrades = grades.copyOf()

    for ( i in copyOfGrades.indices ) {
        if ( copyOfGrades[i] >= 38 ){
            when {

                copyOfGrades[i] % 5 == 3 -> copyOfGrades[i] = copyOfGrades[i] + 2
                copyOfGrades[i] % 5 == 4 -> copyOfGrades[i] = copyOfGrades[i] + 1

            }
        }

        else {}
    }
    return copyOfGrades

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
