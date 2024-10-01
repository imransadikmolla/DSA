class DiameterOfBinaryTree {
    private static int ans=0;
    public static int height(TreeNode root)
    {
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        ans=Math.max(ans, lh+rh);
        return 1+Math.max(lh, rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        height(root);
        return ans;
    }


}
