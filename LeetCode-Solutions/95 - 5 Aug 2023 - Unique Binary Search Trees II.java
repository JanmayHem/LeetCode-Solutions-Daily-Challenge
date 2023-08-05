/*
Runtime: 1 ms
Beats 99.88%of users with Java

Memory: 43.60 mb
Beats 78.67%of users with Java
*/
 
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return n>0? helper(1, n) : new ArrayList<>();
    }

    private List<TreeNode> helper(int l, int r){
        List<TreeNode> all = new ArrayList<>();
        if(l>r){
            all.add(null);
            return all;
        }

        for(int i=l; i<=r; i++){
            List<TreeNode> lTrees = helper(l, i-1);
            List<TreeNode> rTrees = helper(i+1, r);
            for(TreeNode left: lTrees){
                for(TreeNode right: rTrees){
                    TreeNode curr = new TreeNode(i);
                    curr.left = left;
                    curr.right = right;
                    all.add(curr);  
                }
            } 
        }
        return all;
    }
}
