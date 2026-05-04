/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun validate(node: TreeNode?, min: Long, max: Long): Boolean {
        if (node == null) return true

        // Convert node value to Long before comparing
        if (node.`val`.toLong() <= min || node.`val`.toLong() >= max) {
            return false
        }

        return validate(node.left, min, node.`val`.toLong()) &&
               validate(node.right, node.`val`.toLong(), max)
    }
}