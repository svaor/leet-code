package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0041

class FirstMissingPositive {
    fun firstMissingPositive(nums: IntArray): Int {
        nums.withIndex().forEach { (index, element) ->
            putInRightPlace(nums, index, element)
        }

        val value = nums.withIndex().firstOrNull { (index, value) ->
            index != value - 1
        }
        val result = value?.index ?: nums.size

        return result + 1
    }

    private tailrec fun putInRightPlace(nums: IntArray, index: Int, element: Int) {
        val size = nums.size
        if (element in 1 .. size && element - 1 != index && nums[element - 1] != element) {
            val temp = nums[element - 1]
            nums[element - 1] = element
            nums[index] = temp

            putInRightPlace(nums, index, temp)
        }
    }
}
