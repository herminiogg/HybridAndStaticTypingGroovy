package com.examples.fibonacci


/**
 * Created by Herminio on 04/11/2015.
 */

def fib = new FibonacciCompileStatic()

def results = new TestFibonacci().results(fib)
println "Compile Static times: " + results
new TestFibonacci().printLikeCSV(results)