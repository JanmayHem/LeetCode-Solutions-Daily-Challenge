class Solution {
    public int getMinimumDifference(TreeNode root) {
        function(root);
        return ans;
    }

    private int ans=Integer.MAX_VALUE;
    private Integer pred=null;

    private void function(TreeNode root){
        if(root == null) return;
        function(root.left);
        if(pred != null) ans = Math.min(ans, root.val-pred);
        pred = root.val;
        function(root.right);

    }
}
