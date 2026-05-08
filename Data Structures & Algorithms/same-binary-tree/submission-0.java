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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p,q);
        }
    public boolean helper(TreeNode p , TreeNode q ){
        TreeNode curr1=p;
        TreeNode curr2=q;
        if(curr1==null&&curr2==null){
            return true;
        }
        if(curr1==null || curr2 == null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return helper(p.left,q.left) && helper(p.right,q.right);
    }
}
