class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var rows = matrix.size
        var cols = matrix[0].size
        var right = rows * cols - 1
        var left = 0
        while (left <= right) {

            var mid = left + (right - left)/2
            var row = mid / cols
            var col = mid % cols
            if(matrix[row][col] == target) {
                return true
            }
            else if(matrix[row][col] < target) {
                left = mid + 1
            }
            else {
                right = mid - 1
            }
        } 
        return false
    }
}
