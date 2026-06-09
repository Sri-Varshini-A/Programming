class Solution {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        root.left = build(preorder, inorder, inStart, index - 1);
        root.right = build(preorder, inorder, index + 1, inEnd);

        return root;
    }
}
