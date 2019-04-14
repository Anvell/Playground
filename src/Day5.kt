import java.util.*

/*
    Given two singly linked lists that intersect at some point,
    find the intersecting node. The lists are non-cyclical.

    For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10,
    return the node with value 8.

    In this example, assume nodes with the same value are the exact same node objects.
    Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
*/

val day5 = {
    val a = LinkedList<Int>(listOf(3, 7, 8, 10))
    val b = LinkedList<Int>(listOf(99, 1, 8, 10))

    print("Result: ${getIntersection(a, b)?: "not found"}")
}

private fun getIntersection(a: LinkedList<Int>, b: LinkedList<Int>) : Int? {
    var lastIntersection: Int? = null

    while(true) {
        val element = a.pollLast()
        if(element != null && element == b.pollLast()) {
            lastIntersection = element
        } else {
            return lastIntersection
        }
    }
}