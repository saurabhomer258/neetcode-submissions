/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
             var result = mutableListOf<List<Int>>()
             var queue = ArrayDeque<TreeNode>()
             if(root == null) return result
             queue.add(root)
             while(queue.isNotEmpty() ) {
                var list = mutableListOf<Int>()
                var len = queue.size
                for (i in 0 until len) {
                    var item = queue.removeFirst()
                    item.left?.let {
                       queue.add(it)
                    }
                     item.right?.let {
                        queue.add(item.right)
                     }
                  
                    list.add(item.`val`)
                }
                result.add(list)
             }
             return result
    }
}
