/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var curr = head
        var count = 0

        while (curr != null && count < k) {
            curr = curr.next
            count++
        }

        if (count < k) return head

        var prev: ListNode? = null
        curr = head
        count = 0
        while (curr != null && count < k) {
            var next = curr.next 
            curr.next = prev
            prev = curr
            curr = next
            count ++

        }
        head?.next = reverseKGroup(curr, k)
        return prev

    }
}
