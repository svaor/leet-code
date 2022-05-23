package org.svaor.tutorial.leetcode.java.p0001_0100.p0013;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanToIntegerTest {
    @Test
    public void romanToInt() {
        final RomanToInteger romanToInteger = new RomanToInteger();
        assertThat(romanToInteger.romanToInt("III"), equalTo(3));
        assertThat(romanToInteger.romanToInt("IV"), equalTo(4));
        assertThat(romanToInteger.romanToInt("IX"), equalTo(9));
        assertThat(romanToInteger.romanToInt("LVIII"), equalTo(58));
        assertThat(romanToInteger.romanToInt("MCMXCIV"), equalTo(1994));
    }

    @Test
    public void romanToIntErroneous() {
        final RomanToInteger romanToInteger = new RomanToInteger();
        assertThat(romanToInteger.romanToInt("IM"), equalTo(-1));
    }
}
