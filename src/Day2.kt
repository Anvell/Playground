/*
    Given an array of integers, return a new array such that each element at index i of
    the new array is the product of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?
*/

val day2 = {
    val numbers = listOf(1, 2, 3, 4, 5)
    print("Result: ${productOf(numbers)}")
}

private fun productOf(input: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (index in input.indices) {
        var e = 1
        for ((i, n) in input.withIndex()) {
            if (i != index) {
                e *= n
            }
        }
        result.add(e)
    }
    return result
}
