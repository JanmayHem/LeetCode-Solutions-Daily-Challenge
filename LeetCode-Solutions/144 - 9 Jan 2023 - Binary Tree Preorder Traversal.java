/*
Runtime: 0 ms Beats 100%
Memory: 40.2 MB Beats 97.89%
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
	    traversal(root, result);
	    return result;
   }
    public void traversal(TreeNode root, List<Integer> result) {
	    if(root == null) return;
	    result.add(root.val);
	    traversal(root.left, result);
	    traversal(root.right, result);
    }
}
