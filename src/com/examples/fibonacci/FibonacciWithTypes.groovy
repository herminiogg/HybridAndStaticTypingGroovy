package com.examples.fibonacci

/**
 * Created by Herminio on 04/11/2015.
 */
class FibonacciWithTypes {

    long fib(int n) {
        if(n==0) 0
        else if(n==1) 1
        else fib(n-1) + fib(n-2)
    }
}
