class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = find(root, x);
        TreeNode yy = find(root, y);

        return (lvl(root, xx, 0) == lvl(root, yy, 0) && !sib(root, x, y));
    }

    public TreeNode find(TreeNode root, int x) {
        if (root == null) return null;
        if (root.val == x) return root;

        TreeNode l = find(root.left, x);
        if (l != null) return l;
        return find(root.right, x);
    }

    public boolean sib(TreeNode root, int x, int y) {
        if (root == null) return false;

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) ||
                (root.left.val == y && root.right.val == x)) {
                return true;
            }
        }

        return sib(root.left, x, y) || sib(root.right, x, y);
    }

    public int lvl(TreeNode root, TreeNode x, int lev) {
        if (root == null) return 0;
        if (root == x) return lev;

        int left = lvl(root.left, x, lev + 1);
        if (left != 0) return left;

        return lvl(root.right, x, lev + 1);
    }
}
