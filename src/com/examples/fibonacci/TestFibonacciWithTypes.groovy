package com.examples.fibonacci

/**
 * Created by Herminio on 04/11/2015.
 */

def fib = new FibonacciWithTypes()

def results = new TestFibonacci().results(fib)
println "With types times: " + results
new TestFibonacci().printLikeCSV(results)