class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        TreeNode leftTreeNode=invertTree(root.left);
        TreeNode rightTreeNode=invertTree(root.right);
        
        root.left=rightTreeNode;
        root.right=leftTreeNode;
        
        return root;
    }
}
