package com.examples.sort

/**
 * Created by Herminio on 01/11/2015.
 */

def sortCalculatorDynamic = new SortDynamic()

def dynamicResults = new TestSort().results(sortCalculatorDynamic)
println "All Dynamic times: " + dynamicResults
new TestSort().printLikeCSV(dynamicResults)
