/*
Runtime 0 ms Beats 100%
Memory 41.7 MB Beats 98.49%
*/

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
    private int dfs(TreeNode node, int min, int max) {
        if (node == null) return Integer.MIN_VALUE;
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        int leftMax = dfs(node.left, min, max);
        int rightMax = dfs(node.right, min, max);
        return Math.max(max - min, Math.max(leftMax, rightMax));
    }
}
