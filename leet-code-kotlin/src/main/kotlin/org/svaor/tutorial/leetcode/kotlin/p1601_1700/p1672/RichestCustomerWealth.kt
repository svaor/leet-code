package org.svaor.tutorial.leetcode.kotlin.p1601_1700.p1672

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        // 1.4 lang level. 1.3: accounts.map { it.sum() }.max() ?: 0
        return accounts.maxOfOrNull { it.sum() } ?: 0
    }
}
