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
        private int preidx;
        private HashMap<Integer,Integer>map=new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
        map= new HashMap<>(inorder.length);
        int preidx=0;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       return build(preorder, 0, inorder.length - 1);
        }
        private TreeNode build(int preorder[],int str,int end){
            if(str>end)return null;

            int rootval=preorder[preidx++];
            TreeNode root=new TreeNode(rootval);
            int mid=map.get(rootval);
             root.left = build(preorder, str, mid - 1);

        root.right = build(preorder, mid + 1, end);

        return root;

        }
    }