//  Created by beyyzgur on 27.08.2025.
//

import Foundation

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */
    
func diagonalDifference(arr: [[Int]]) -> Int {
    // Write your code here
    var sumPrimary = 0
    var sumSecondary = 0
    let count = arr.count - 1
    
    for i in 0...count { // func for both sums
        sumPrimary += arr[i][i]
        sumSecondary += arr[i][count - i]
    }
    
    let sum = abs(sumSecondary - sumPrimary)
    return sum
}
