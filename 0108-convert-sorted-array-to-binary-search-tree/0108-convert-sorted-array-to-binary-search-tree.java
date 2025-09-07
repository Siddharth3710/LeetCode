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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public  TreeNode helper(int nums[],int str,int end){
        if(str>end)return null;
        int mid=str+(end-str)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,str,mid-1);
        root.right=helper(nums,mid+1,end);

        return root;
    }
}