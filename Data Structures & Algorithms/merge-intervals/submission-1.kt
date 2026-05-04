class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
            intervals.sortBy { it[0] }
            var result = mutableListOf<IntArray>()
            for(i in intervals.indices) {
                if(result.isEmpty() || result.last()[1] < intervals[i][0]) {
                    result.add(intervals[i])
                }
                else {
                    result.last()[1] = max(result.last()[1],intervals[i][1])
                }
            }
            return result.toTypedArray()
    }
}
