/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var count = 0;
    var result =0;
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        
        dfs(root,k)
        return result
    }

    fun dfs(root : TreeNode? , k : Int) {
        if(root == null) return 
        dfs(root.left, k)
        count++
        if(k == count) {
                result = root.`val`
                return
        }
        dfs(root.right, k)
    }
}
