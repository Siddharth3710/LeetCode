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
    public List<String> binaryTreePaths(TreeNode root) {
      
        List<String>res=new ArrayList<>();
          if(root==null)return res;
         helper(root,"",res);
         return res;
    }
    public void helper(TreeNode root,String s,List<String>res){
        if(root==null)return ;

        if(s.isEmpty()){
            s+=Integer.toString(root.val);
        }
        else{
            s+="->"+root.val;
        }

        if(root.left==null && root.right==null){
            res.add(s);
            return ;
        }


        
        helper(root.left,s,res);
        helper(root.right,s,res);
    }
}