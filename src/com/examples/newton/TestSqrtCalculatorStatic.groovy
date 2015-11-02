package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */

def sqrtCalculatorStatic = new SqrtCalculatorStatic(1E-7)

def allStaticResults = new TestSqrtCalculator().allResults(sqrtCalculatorStatic)
println "All Static times: " + allStaticResults
new TestSqrtCalculator().printLikeCSV(allStaticResults)