/*
O(N) solution
*/

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<Integer>();
        List<Integer> leaf2 = new ArrayList<Integer>();
        DFS(root1, leaf1);
        DFS(root2, leaf2);
        return leaf1.equals(leaf2);
    }
    
    public void DFS(TreeNode root, List leaf){
        if (root == null) return;
        if (root.left == null && root.right ==null) leaf.add(root.val);
        DFS(root.right, leaf);
        DFS(root.left, leaf);
    }
}
