/*
Runtime: 0 ms Beats 100%
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root, root);
    }

    private boolean mirror(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        return a.val==b.val && mirror(a.right, b.left) && mirror(a.left, b.right); 
    }
}
