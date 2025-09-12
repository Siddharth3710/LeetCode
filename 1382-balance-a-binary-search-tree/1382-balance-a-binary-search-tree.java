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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        getsorted(root,a);

        return   balabst(a,0,a.size()-1);
    }
    public static void getsorted(TreeNode root,ArrayList<Integer>a){
        if(root==null)return ;
          getsorted(root.left,a);
          a.add(root.val);
          getsorted(root.right,a);
    }
    public static TreeNode balabst(ArrayList<Integer>a,int str,int end ){
        if(str>end)return null;
        int mid=str+(end-str)/2;
        TreeNode root=new TreeNode(a.get(mid));
       root.left= balabst(a,str,mid-1);
         root.right= balabst(a,mid+1,end);

          return root;

    }
}