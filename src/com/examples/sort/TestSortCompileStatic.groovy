package com.examples.sort

/**
 * Created by Herminio on 01/11/2015.
 */

def sortCalculatorCompileStatic = new SortCompileStatic()

def compileStatic = new TestSort().results(sortCalculatorCompileStatic)
println "Compile Static times: " + compileStatic
new TestSort().printLikeCSV(compileStatic)
