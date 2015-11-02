package com.examples.javaSort

/**
 * Created by Herminio on 01/11/2015.
 */

def sortCalculatorStatic = new SortStatic()

def staticResults = new TestSort().results(sortCalculatorStatic)
println "Static times: " + staticResults
new TestSort().printLikeCSV(staticResults)
