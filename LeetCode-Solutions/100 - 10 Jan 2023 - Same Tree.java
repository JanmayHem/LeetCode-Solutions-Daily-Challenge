/*
Runtime: 0 ms Beats 100%
Memory: 39.8 MB Beats 76.33%
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
