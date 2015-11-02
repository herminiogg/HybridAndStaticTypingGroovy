package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */
class SqrtCalculatorWithTypes {

    private final int maxIterations
    private double tolerance

    SqrtCalculatorWithTypes(double tolerance, int maxIterations = 20) {
        this.tolerance = tolerance
        this.maxIterations = maxIterations
    }

    private boolean isGoodEnough(double x0, double x1) {
        Math.abs((x1 - x0) / x1) < tolerance
    }

    private double calculateNext(double x0, double number) {
        x0 - ((Math.pow(x0, 2) - number) / (2 * x0))
    }

    public double sqrt(double number, double initialGuess) {
        (1..maxIterations).inject(initialGuess) { acc, val ->
            double x1 = calculateNext(acc, number)
            isGoodEnough(acc, x1) ? acc : x1
        }
    }

}
