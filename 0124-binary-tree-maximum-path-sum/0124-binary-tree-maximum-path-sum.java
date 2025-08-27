/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private static int ts;
    public int maxPathSum(TreeNode root) {
       ts= Integer.MIN_VALUE;
            maxgain(root);
            return ts;
    }
    private static int maxgain(TreeNode root){
        if (root==null){
            return 0;
        }
         int lg = Math.max(maxgain(root.left), 0);
            int rg = Math.max(maxgain(root.right), 0);

         int cp=lg+rg+root.val;
         ts=Math.max(ts,cp);

         return root.val+Math.max(lg,rg);

    }
}