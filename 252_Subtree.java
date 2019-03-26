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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s,t);
    }
    public boolean traverse(TreeNode s,TreeNode t)
    {
        return s!=null &&(compare(s,t) || traverse(s.left,t) ||traverse(s.right,t));
    }
    public boolean compare(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
        {
            return true;
        }
        if(x==null || y==null)
        {
            return false;
        }
        return x.val==y.val && compare(x.left,y.left) && compare(x.right,y.right);
    }
    
}