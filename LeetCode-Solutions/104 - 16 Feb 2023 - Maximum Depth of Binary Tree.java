/*
Runtime: 0 ms Beats 100%
Memory: 42.1 MB Beats 63.23%
*/

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
