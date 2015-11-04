package com.examples.scimark

/**
 * Created by Herminio on 04/11/2015.
 */
import jnt.scimark2.commandline

def runBench() {
    commandline.main()
}

1..30.times {
    runBench()
}
