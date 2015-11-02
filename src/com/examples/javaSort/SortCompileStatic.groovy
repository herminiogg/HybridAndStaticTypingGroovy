package com.examples.javaSort

import groovy.transform.CompileStatic

/**
 * Created by Herminio on 01/11/2015.
 */
@CompileStatic
class SortCompileStatic {

    List<Integer> sort(List<Integer> list) {
        Arrays.sort(list)
        list
    }
}
