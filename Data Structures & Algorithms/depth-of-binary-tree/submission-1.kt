/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
            if(root == null) return 0
          var depth  = Math.max(maxDepth(root.left),maxDepth(root.right)) +1
          return depth
    }
}
