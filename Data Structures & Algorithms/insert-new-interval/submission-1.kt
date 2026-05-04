class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
                var result = mutableListOf<IntArray>()
                var i = 0
                var start = newInterval[0]
                var end = newInterval[1]
                var n = intervals.size
                while(i < n && intervals[i][1] < newInterval[0]) {
                      result.add(intervals[i])  
                      i++
                }
                while(i<n && intervals[i][0] <= newInterval[1]) {
                    start = min(start ,intervals[i][0])
                    end = max(end , intervals[i][1])
                    i++
                }
                result.add(intArrayOf(start,end))
                while (i<n) {
                    result.add(intervals[i])
                     i++
                }
        return result.toTypedArray()

    }
}
