class Solution {

    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {

        val result = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()

        fun dfs(index: Int, total: Int) {

            if (total == target) {
                result.add(ArrayList(current))
                return
            }

            if (index >= nums.size || total > target) {
                return
            }

            // choose current number
            current.add(nums[index])
            dfs(index, total + nums[index])

            // backtrack
            current.removeAt(current.size - 1)

            // skip current number
            dfs(index + 1, total)
        }

        dfs(0, 0)
        return result
    }
}