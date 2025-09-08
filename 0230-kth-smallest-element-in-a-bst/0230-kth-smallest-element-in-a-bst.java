import java.util.*;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);        
        Collections.sort(res);      
        return res.get(k - 1);       
        
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);          
        preorder(root.left, res);   
        preorder(root.right, res);   
    }
}
