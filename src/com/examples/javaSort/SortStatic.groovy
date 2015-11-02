package com.examples.javaSort

import groovy.transform.TypeChecked

/**
 * Created by Herminio on 01/11/2015.
 */
@TypeChecked
class SortStatic {

    List<Integer> sort(List<Integer> list) {
        Arrays.sort(list)
        list
    }
}
