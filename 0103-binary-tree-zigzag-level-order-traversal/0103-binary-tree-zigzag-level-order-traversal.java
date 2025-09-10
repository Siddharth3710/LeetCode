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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        
        int height = getHeight(root);
        
        for (int i = 0; i < height; i++) {
            List<Integer> level = new ArrayList<>();
            if (i % 2 == 0) {
                // Even levels: left to right
                traverseLevel(root, i, level, true);
            } else {
                // Odd levels: right to left
                traverseLevel(root, i, level, false);
            }
            res.add(level);
        }
        return res;
    }
    
    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    private void traverseLevel(TreeNode root, int level, List<Integer> list, boolean leftToRight) {
        if (root == null) return;
        
        if (level == 0) {
            list.add(root.val);
            return;
        }
        
        if (leftToRight) {
            traverseLevel(root.left, level - 1, list, leftToRight);
            traverseLevel(root.right, level - 1, list, leftToRight);
        } else {
            traverseLevel(root.right, level - 1, list, leftToRight);
            traverseLevel(root.left, level - 1, list, leftToRight);
        }
    }
}