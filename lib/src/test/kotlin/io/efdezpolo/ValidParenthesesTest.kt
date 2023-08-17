package io.efdezpolo

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class ValidParenthesesTest {
    @ParameterizedTest(name = "{index} \"{0}\" should be valid")
    @ValueSource(strings = ["(((((((((())))))))))", "", "{[]}", "()[]{}"])
    fun `test all valid strings`(validStringToCheck: String) {
        val isValid = ValidParentheses(validStringToCheck).check()

        assertTrue(isValid, "the all parentheses string should be valid")
    }

    @ParameterizedTest(name = "{index} \"{0}\" should be invalid")
    @ValueSource(strings = [")(", "([)])", ")", "("])
    fun `test all invalid strings`(invalidStringToCheck: String) {
        val isValid = ValidParentheses(invalidStringToCheck).check()

        assertFalse(isValid, "the all parentheses string should be valid")
    }
}