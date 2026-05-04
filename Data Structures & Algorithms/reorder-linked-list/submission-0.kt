/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head?.next == null) return

        // 1️⃣ Find middle
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // 2️⃣ Reverse second half
        var second = slow?.next
        slow?.next = null

        var prev: ListNode? = null
        while (second != null) {
            val temp = second.next
            second.next = prev
            prev = second
            second = temp
        }

        // 3️⃣ Merge two halves
        var first: ListNode? = head
        second = prev

        while (second != null) {
            val temp1 = first?.next
            val temp2 = second.next

            first?.next = second
            second.next = temp1

            first = temp1
            second = temp2
        }
    }
}