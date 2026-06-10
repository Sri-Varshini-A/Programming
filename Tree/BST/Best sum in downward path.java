class Solution {
    int ans = Integer.MIN_VALUE;

    public int maxDownwardPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        int curr = node.val + Math.max(left, right);

        ans = Math.max(ans, curr);

        return curr;
    }
}
