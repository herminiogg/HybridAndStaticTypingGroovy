package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */

def sqrtCalculatorDynamic = new SqrtCalculatorDynamic(1E-7)

def allDynamicResults = new TestSqrtCalculator().allResults(sqrtCalculatorDynamic)
println "All Dynamic times: " + allDynamicResults
new TestSqrtCalculator().printLikeCSV(allDynamicResults)