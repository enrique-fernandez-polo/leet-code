package io.efdezpolo

class AlternatingSort(private val numbers: Array<Int>) {

    fun find(): Array<Int> {
        for (i in 1..<numbers.size step 2) {
            if (previousNumberIsBigger(i)) swap(i - 1, i)
            if (thereAreMoreElements(i) && nextNumberIsSmaller(i)) swap(i + 1, i)
        }
        return numbers
    }

    private fun nextNumberIsSmaller(i: Int) = numbers[i] < numbers[i + 1]

    private fun thereAreMoreElements(i: Int) = i + 1 < numbers.size

    private fun previousNumberIsBigger(i: Int) = numbers[i - 1] > numbers[i]

    private fun swap(positionA: Int, positionB: Int) {
        val temp = numbers[positionA]
        numbers[positionA] = numbers[positionB]
        numbers[positionB] = temp
    }
}