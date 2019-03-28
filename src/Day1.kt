/*
    Given a list of numbers and a number k, return whether any two numbers
    from the list add up to k.
    For example, given [10, 15, 3, 7] and k of 17, return true
    since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
*/

fun main() {
    val num = 17
    val list = listOf(10, 15, 3, 7)

    print(
            if(containsSumOf(list, num))
                "The list contains sum of $num"
            else
                "The list does not contain sum of $num"
    )
}

fun containsSumOf(list: List<Int>, num: Int): Boolean {
    for ((index, currentNumber) in list.withIndex()) {
        for ((i, n) in list.withIndex()) {
            if (i != index) {
                if (n + currentNumber == num) {
                    return true
                }
            }
        }
    }
    return false
}
