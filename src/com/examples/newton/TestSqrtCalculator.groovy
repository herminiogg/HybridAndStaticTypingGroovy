package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */
class TestSqrtCalculator {

    def allResults(sqrtCalculator) {
        (1..30).collect { x ->
            (1..100000).inject(0) { acc, val ->
                long t1 = System.currentTimeMillis()
                sqrtCalculator.sqrt(10, 5)
                long t2 = System.currentTimeMillis()
                acc + (t2 - t1)
            }
        }
    }

    void printLikeCSV(list) {
        println list.join(";")
    }
}
