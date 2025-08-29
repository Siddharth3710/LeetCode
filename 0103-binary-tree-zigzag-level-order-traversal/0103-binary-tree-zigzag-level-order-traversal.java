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
        int lvl=height(root);
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<lvl;i++){
            ArrayList<Integer>a= new ArrayList<>();
            if(i%2==0){
                nlvl(root,i,a);
            }
            else{
                nlvl2(root,i,a);

            }
            res.add(a);
        }
        return res;
    }
    public int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void nlvl(TreeNode root,int n,List<Integer> list){
        if(root==null)return ;
        if(n==1){
            list.add(root.val);
            return;
        }
         nlvl(root.right,n-1,list);
        nlvl(root.left,n-1,list);
       
    }
     public void nlvl2(TreeNode root,int n,List<Integer> list){
        if(root==null)return ;
        if(n==1){
            list.add(root.val);
            return;
        }
        nlvl2(root.left,n-1,list);
                nlvl2(root.right,n-1,list);

      
    }

}