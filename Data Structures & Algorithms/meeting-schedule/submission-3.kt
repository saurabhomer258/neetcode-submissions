/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {

    fun canAttendMeetings(intervals: List<Interval>): Boolean {

        if (intervals.size <= 1) return true

        val sorted = intervals.sortedBy { it.start }

        for (i in 1 until sorted.size) {
            if (sorted[i].start < sorted[i - 1].end) {
                return false
            }
        }

        return true
    }
}
