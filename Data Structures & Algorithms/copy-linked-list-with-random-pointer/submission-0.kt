/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {

        if (head == null) return null

        var curr = head

        while (curr != null) {

            val copy = Node(curr.`val`)

            copy.next = curr.next
            curr.next = copy

            curr = copy.next
        }


        curr = head

        while (curr != null) {

            curr.next?.random = curr.random?.next

            curr = curr.next?.next
        }

        curr = head

        val dummy = Node(0)
        var copyCurr: Node? = dummy

        while (curr != null) {

            val copy = curr.next
            val nextOriginal = copy?.next

            copyCurr?.next = copy
            copyCurr = copy

            curr.next = nextOriginal

            curr = nextOriginal
        }

        return dummy.next
    }
}