/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
              val dummy = ListNode(0)
        dummy.next = head
        
        var fast: ListNode? = dummy
        var slow: ListNode? = dummy

        // move fast n steps
        repeat(n) {
            fast = fast?.next
        }

        // move both until fast reaches end
        while (fast?.next != null) {
            fast = fast?.next
            slow = slow?.next
        }

        // delete node
        slow?.next = slow?.next?.next

        return dummy.next
    }
}
