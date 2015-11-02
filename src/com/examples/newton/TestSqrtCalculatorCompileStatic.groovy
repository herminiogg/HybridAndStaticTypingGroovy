package com.examples.newton

/**
 * Created by Herminio on 30/10/2015.
 */

def sqrtCalculatorCompileStatic = new SqrtCalculatorCompileStatic(1E-7)

def allCompileStaticResults = new TestSqrtCalculator().allResults(sqrtCalculatorCompileStatic)
println "All Static and Compiled times: " + allCompileStaticResults
new TestSqrtCalculator().printLikeCSV(allCompileStaticResults)