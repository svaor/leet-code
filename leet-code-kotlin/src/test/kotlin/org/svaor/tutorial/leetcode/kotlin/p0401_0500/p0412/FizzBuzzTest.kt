package org.svaor.tutorial.leetcode.kotlin.p0401_0500.p0412

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {
    @Test
    fun fizzBuzz() {
        val fizzBuzz = FizzBuzz()
        assertThat(fizzBuzz.fizzBuzz(3), `is`(listOf("1", "2", "Fizz")))
        assertThat(fizzBuzz.fizzBuzz(5), `is`(listOf("1", "2", "Fizz", "4", "Buzz")))
        assertThat(fizzBuzz.fizzBuzz(15), `is`(listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")))
    }
}
