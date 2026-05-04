/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {

        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next          // move 1 step
            fast = fast.next?.next     // move 2 steps

            if (slow == fast) {
                return true
            }
        }

        return false
    }
}
