package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */
class SqrtCalculatorDynamic {

    private def final maxIterations
    private def tolerance

    SqrtCalculatorDynamic(tolerance, maxIterations = 20) {
        this.tolerance = tolerance
        this.maxIterations = maxIterations
    }

    private def isGoodEnough(x0, x1) {
        Math.abs((x1 - x0) / x1) < tolerance
    }

    private def calculateNext(x0, number) {
        x0 - ((Math.pow(x0, 2) - number) / (2 * x0))
    }

    public def sqrt(number, initialGuess) {
        (1..maxIterations).inject(initialGuess) { acc, val ->
            def x1 = calculateNext(acc, number)
            isGoodEnough(acc, x1) ? acc : x1
        }
    }

}
