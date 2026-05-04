/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
     fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        
        // Case 1: both null
        if (p == null && q == null) return true
        
        // Case 2: one null
        if (p == null || q == null) return false
        
        // Case 3: values different
        if (p.`val` != q.`val`) return false
        
        // Case 4: check left and right
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right)
    }
}
