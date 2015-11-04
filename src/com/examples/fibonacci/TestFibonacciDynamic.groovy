package com.examples.fibonacci

/**
 * Created by Herminio on 04/11/2015.
 */

def fib = new FibonacciDynamic()

def results = new TestFibonacci().results(fib)
println "Dynamic times: " + results
new TestFibonacci().printLikeCSV(results)