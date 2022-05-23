package org.svaor.tutorial.leetcode.java.p0001_0100.p0013;

import java.util.*;

public class RomanToInteger {
    public int romanToInt(String romanNumber) {
        if (!validateRoman(romanNumber)) {
            return -1;
        }

        Roman last = null;
        int result = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            final Roman current = Roman.ROMANS.get(romanNumber.charAt(i));
            if (current == null) {
                return -1;
            }

            if (last == null || current.compareTo(last) >= 0) {
                result += current.value;
            } else {
                result -= current.value;
            }

            last = current;
        }

        return result;
    }

    private boolean validateRoman(String romanNumber) {
        return romanNumber.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    static class Roman implements Comparable<Roman> {
        private static final Roman I = new Roman(1);
        private static final Roman V = new Roman(5);
        private static final Roman X = new Roman(10);
        private static final Roman L = new Roman(50);
        private static final Roman C = new Roman(100);
        private static final Roman D = new Roman(500);
        private static final Roman M = new Roman(1000);

        private static final Map<Character, Roman> ROMANS = new HashMap<>();
        static {
            ROMANS.put('I', I);
            ROMANS.put('V', V);
            ROMANS.put('X', X);
            ROMANS.put('L', L);
            ROMANS.put('C', C);
            ROMANS.put('D', D);
            ROMANS.put('M', M);
        }

        private final int value;

        private Roman(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Roman o) {
            return Integer.compare(value, o.value);
        }
    }
}
