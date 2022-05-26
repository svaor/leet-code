package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0001

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        return twoSumMap(nums, target)
    }

    private fun twoSumMap(nums: IntArray, target: Int): IntArray {
        val map = nums.mapIndexed { index, value -> value to index }
            .groupByTo(
                LinkedHashMap(),
                { key -> key.first },
                { value -> value.second }
            )

        return map.firstNotNullOf { entry ->
            val tail = target - entry.key
            val tailIndices = map[tail] ?: return@firstNotNullOf null

            if (tail != entry.key) {
                return@firstNotNullOf intArrayOf(entry.value[0], tailIndices[0])
            } else if (tail == entry.key && tailIndices.size > 1) {
                return@firstNotNullOf intArrayOf(entry.value[0], tailIndices[1])
            }

            return@firstNotNullOf null
        }
    }

    private fun twoSumSorted(nums: IntArray, target: Int): IntArray {
        val valueIndexSortedPairs = nums.mapIndexed { index, value -> value to index }
            .sortedBy { it.first }
        var leftIndex = 0
        var rightIndex = nums.size - 1
        var leftOrigIndex = valueIndexSortedPairs[leftIndex].second
        var rightOrigIndex = valueIndexSortedPairs[rightIndex].second
        while (leftIndex < rightIndex) {
            val sum = valueIndexSortedPairs[leftIndex].first + valueIndexSortedPairs[rightIndex].first
            if (sum == target) {
                break
            } else if (sum > target) {
                rightIndex--
                rightOrigIndex = valueIndexSortedPairs[rightIndex].second
            } else {
                leftIndex++
                leftOrigIndex = valueIndexSortedPairs[leftIndex].second
            }
        }

        return intArrayOf(leftOrigIndex, rightOrigIndex)
    }
}
