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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double>res=new ArrayList<>();
         if(root==null){
            return res;
         }
         Queue<TreeNode>q=new LinkedList<>();
         q.offer(root);
        
         while(!q.isEmpty()){
            int size=q.size();
             double sum=0;
            for(int i=0;i<size;i++){
                TreeNode currnode=q.poll();
               sum+=currnode.val;
              
               
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
             double avg=sum/size;
            res.add(avg);
         }
         return res;
    }
}