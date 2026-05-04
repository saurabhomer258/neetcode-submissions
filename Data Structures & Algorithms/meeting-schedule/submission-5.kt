/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
       val sorted = intervals.sortedBy { it.start }
          if(intervals.size <= 1) { return true}
          for( i in 1 until sorted.size) {
               if(sorted[i].start < sorted[i - 1].end) {
                    return false 
               }
          }
          return true
    }
}
