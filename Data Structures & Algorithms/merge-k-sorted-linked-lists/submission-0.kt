/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val minHeap = PriorityQueue<ListNode> { a, b -> a.`val` - b.`val` }

        // add first node of each list
        for (node in lists) {
            if (node != null) {
                minHeap.add(node)
            }
        }

        val dummy = ListNode(0)
        var current = dummy

        while (minHeap.isNotEmpty()) {

            val node = minHeap.poll()
            current.next = node
            current = current.next!!

            if (node.next != null) {
                minHeap.add(node.next)
            }
        }

        return dummy.next
    }
}
