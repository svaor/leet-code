package org.svaor.tutorial.leetcode.kotlin.p1301_1400.p1342

class NumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        var value = num
        var steps = 0
        while (value != 0) {
            if (value % 2 == 0) {
                value /= 2
            } else {
                value--
            }
            steps++
        }

        return steps
    }
}
