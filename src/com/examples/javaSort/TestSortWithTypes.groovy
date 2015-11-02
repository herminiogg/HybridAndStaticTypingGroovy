package com.examples.javaSort

/**
 * Created by Herminio on 01/11/2015.
 */

def sortCalculatorWithTypes = new SortWithTypes()

def withTypesResults = new TestSort().results(sortCalculatorWithTypes)
println "With Types times: " + withTypesResults
new TestSort().printLikeCSV(withTypesResults)
