/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root,root);
    }
    public boolean isSym(TreeNode X1, TreeNode X2)
    {
        if(X1 == null && X2 == null) return true;
        if(X1 == null || X2 == null) return false;
        return (X1.val == X2.val)
            && isSym(X1.right,X2.left)
            && isSym(X1.left,X2.right);
    }
}