package com.examples.sort

/**
 * Created by Herminio on 01/11/2015.
 */
class TestSort {

    def results(sortStrategy) {
        (1..30).collect { x ->
            (1..100000).inject(0) { acc, val ->
                List<Integer> list = generateRandomList()
                long t1 = System.currentTimeMillis()
                sortStrategy.sort(list)
                long t2 = System.currentTimeMillis()
                acc + (t2 - t1)
            }
        }
    }

    private List<Integer> generateRandomList() {
        (1..30).collect { i ->
            new Random().nextInt()
        }
    }

    void printLikeCSV(list) {
        println list.join(";")
    }
}
