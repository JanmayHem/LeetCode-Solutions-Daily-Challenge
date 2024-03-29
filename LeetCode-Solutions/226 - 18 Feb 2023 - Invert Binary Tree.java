/*
Runtime: 0 ms Beats 100%
*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left=root.left, right=root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
