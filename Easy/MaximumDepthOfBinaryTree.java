//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 39.2 MB, less than 10.20% of Java online submissions for Maximum Depth of Binary Tree.

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}