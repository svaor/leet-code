package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0015

class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return listOf()
        }

        val result = mutableListOf<List<Int>>()
        val sorted = nums.sorted()
        val size = sorted.size
        var previousElement: Int? = null
        for (i in 0 .. size - 3) {
            val currentElement = sorted[i]
            if (currentElement == previousElement) {
                // same element produce same result, skip it
                continue
            }
            previousElement = currentElement

            // find possible pairs which sum equals current element (or sum of triple equals 0)
            var left = i + 1
            var right = size - 1
            while (left < right) {
                val currentSum = sorted[left] + sorted[right] + currentElement
                if (currentSum > 0) {
                    right--
                } else if (currentSum < 0) {
                    left++
                } else {
                    result.add(
                        listOf(currentElement, sorted[left], sorted[right])
                    )

                    // here duplicated triplets ara possible, so skip them
                    while (left < right && sorted[left + 1] == sorted[left]) {
                        left++
                    }
                    while (left < right && sorted[right - 1] == sorted[right]) {
                        right--
                    }
                    left++
                    right--
                }
            }
        }

        return result
    }
}
