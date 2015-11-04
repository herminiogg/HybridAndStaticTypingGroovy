package com.examples.fibonacci

/**
 * Created by Herminio on 04/11/2015.
 */
class TestFibonacci {

    def results(fibStrategy) {
        (1..30).collect { x ->
            long t1 = System.currentTimeMillis()
            fibStrategy.fib(38)
            long t2 = System.currentTimeMillis()
            (t2 - t1)
        }
    }

    void printLikeCSV(list) {
        println list.join(";")
    }


}
