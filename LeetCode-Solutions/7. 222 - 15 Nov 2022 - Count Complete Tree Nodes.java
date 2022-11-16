/* 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Complete Tree Nodes.
Memory Usage: 44.8 MB, less than 94.58% of Java online submissions for Count Complete Tree Nodes.
*/

class Solution {
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
