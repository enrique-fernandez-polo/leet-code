package io.efdezpolo

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class AlternatingSortTest {

    @Test
    fun test() {
        assertArrayEquals(
            arrayOf(2, 5, 1, 9, 7, 8),
            AlternatingSort(arrayOf(5, 2, 1, 7, 9, 8)).find()
        )
    }
}