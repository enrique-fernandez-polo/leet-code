package io.efdezpolo

import java.util.Stack

class ValidParentheses(private val stringToCheck: String) {

    private val stack = Stack<Char>()

    fun check(): Boolean {
        for (char in stringToCheck) {
            if (itIsAnOpenBracket(char)) {
                stack.push(char)
                continue
            }

            if (isAClosingBracketAndThereAreNoPreviousOpenBrackets()) return false

            if (thereIsNotACorrespondingClosingBracket(char)) return false
        }
        return stack.isEmpty()
    }

    private fun itIsAnOpenBracket(char: Char) = openingBrackets.contains(char)

    private fun isAClosingBracketAndThereAreNoPreviousOpenBrackets() = stack.isEmpty()

    private fun thereIsNotACorrespondingClosingBracket(char: Char): Boolean {
        val lastOpeningBracket = stack.pop()
        return validPairs[lastOpeningBracket] != char
    }

    private companion object {
        private val openingBrackets = arrayOf('(', '{', '[')
        private val validPairs = mapOf('(' to ')', '{' to '}', '[' to ']')
    }
}