/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int)
 */

class Solution {

    fun minMeetingRooms(intervals: List<Interval>): Int {

        if (intervals.isEmpty()) return 0

        val start = intervals.map { it.start }.sorted()
        val end = intervals.map { it.end }.sorted()

        var rooms = 0
        var maxRooms = 0
        var endPtr = 0

        for (i in start.indices) {

            if (start[i] < end[endPtr]) {
                rooms++              // new room needed
            } else {
                endPtr++             // room free
            }

            maxRooms = maxOf(maxRooms, rooms)
        }

        return maxRooms
    }
}