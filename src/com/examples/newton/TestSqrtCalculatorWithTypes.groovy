package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */

def sqrtCalculatorWithTypes = new SqrtCalculatorWithTypes(1E-7)

def withTypesResults = new TestSqrtCalculator().allResults(sqrtCalculatorWithTypes)
println "With Types times: " + withTypesResults
new TestSqrtCalculator().printLikeCSV(withTypesResults)