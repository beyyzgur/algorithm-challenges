//  Created by beyyzgur on 06.08.2025.
//

import Foundation
var number: Int = 0
var counter: Int = 1
/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

func birthdayCakeCandles(candles: [Int]) -> Int {
    // Write your code here
    for candle in candles {
        if candle > number {
            number = candle
        } else if candle == number {
            counter += 1
        }
    }
    return counter
}
