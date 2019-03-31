import java.util.*

/*
    Given the root to a binary tree, implement serialize(root), which serializes
    the tree into a string, and deserialize(s), which deserializes the string
    back into the tree.

    For example, given the following Node class

    class Node:
    def __init__(self, val, left=None, right=None):
             self.val = val
             self.left = left
             self.right = right
    The following test should pass:

    node = Node('root', Node('left', Node('left.left')), Node('right'))
    assert deserialize(serialize(node)).left.left.val == 'left.left'
*/

val day3 = {
    val root = Node("root",
            Node("left",
                    Node("left.left")
            ),
            Node("right")
    )

    val data = serialize(root)
    print("Serialized: $data\n")

    val result = deserialize(data)
    print("Deserialized: ${result?.left?.left?.data}")
}

private fun serialize(input: Node?): String {
    return if (input != null)
        "${input.data},${serialize(input.left)},${serialize(input.right)}"
    else
        "null"
}

private fun deserialize(input: String): Node? {
    assert(input.isNotEmpty())
    return decode(LinkedList<String>(input.split(",")))
}

private fun decode(list: Queue<String>): Node? {
    val head = list.remove()
    return if (head == "null") {
        null
    } else {
        Node(
                head,
                decode(list),
                decode(list)
        )
    }
}

private data class Node(
        val data: String,
        val left: Node? = null,
        val right: Node? = null
)