class Solution {
    private int sum = 0; // instance variable to store result
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return sum;
    }

    public void helper(TreeNode root) {
        if (root == null) return;

        // check if left child is a leaf
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        helper(root.left);
        helper(root.right);
    }
}
