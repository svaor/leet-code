package org.svaor.tutorial.leetcode.kotlin.p0001_0100.p0036

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowConstraints = IntArray(9)
        val columnConstraints = IntArray(9)
        val squareConstraints = IntArray(9)
        board.withIndex().forEach { (rowIndex, row) ->
            row.withIndex().forEach { (columnIndex, element) ->
                if (element != '.') {
                    val elementValue = element - '0'
                    val bit = 1.shl(elementValue - 1)

                    val rowValid = processConstraint(rowConstraints, rowIndex, bit)
                    if (!rowValid) {
                        return false
                    }

                    val columnValid = processConstraint(columnConstraints, columnIndex, bit)
                    if (!columnValid) {
                        return false
                    }

                    val squareIndex = getSquareNumber(rowIndex, columnIndex) - 1

                    val squareValid = processConstraint(squareConstraints, squareIndex, bit)
                    if (!squareValid) {
                        return false
                    }
                }
            }
        }

        return true
    }

    private fun processConstraint(constraints: IntArray, index: Int, bit: Int): Boolean {
        val constraintOld = constraints[index]
        val constraintNew = constraintOld.or(bit)
        constraints[index] = constraintNew
        return constraintNew != constraintOld
    }

    @Suppress("unused")
    fun isValidSudokuWithSet(board: Array<CharArray>): Boolean {
        val constraints = mutableMapOf<String, MutableSet<Char>>()
        val defaultValue: () -> MutableSet<Char> = { mutableSetOf() }
        board.withIndex().forEach { (rowNum, row) ->
            row.withIndex().forEach { (columnNum, element) ->
                if (element != '.') {
                    if (!constraints.getOrPut("r$rowNum", defaultValue).add(element)
                        || !constraints.getOrPut("c$columnNum", defaultValue).add(element)
                        || !constraints.getOrPut("s${getSquareNumber(rowNum, columnNum)}", defaultValue).add(element)
                    ) {
                        return false
                    }
                }
            }
        }

        return true
    }

    private fun getSquareNumber(row: Int, column: Int): Int = (1 + column / 3) + (1 + row / 3) * 3 - 3
}
