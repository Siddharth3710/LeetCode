class Solution {
    private int maxDepth = -1;
    private int ans = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    
    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        
        // when first time reaching this depth
        if (depth > maxDepth) {
            maxDepth = depth;
            ans = node.val;
        }
        
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
