package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0026

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        val numsSize = nums.size

        var uniqueElementIndex = 1
        for (i in 1 until numsSize) {
            if (nums[i - 1] != nums[i]) {
                nums[uniqueElementIndex] = nums[i]
                uniqueElementIndex++
            }
        }

        return uniqueElementIndex
    }
}
