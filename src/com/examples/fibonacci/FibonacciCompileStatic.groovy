package com.examples.fibonacci

import groovy.transform.CompileStatic

/**
 * Created by Herminio on 04/11/2015.
 */
@CompileStatic
class FibonacciCompileStatic {

    long fib(int n) {
        if(n==0) 0
        else if(n==1) 1
        else fib(n-1) + fib(n-2)
    }
}
