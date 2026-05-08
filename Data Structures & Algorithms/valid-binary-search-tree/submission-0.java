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
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right == null){
            return true;
        }
        List<TreeNode> path =new ArrayList<>();
        List<TreeNode> result = inorder (root, path);
        for(int i =1; i<result.size();i++){
            if(result.get(i-1).val >= result.get(i).val ){
                return false;
            }
        }
        return true;


    }
    public List<TreeNode> inorder(TreeNode root,List<TreeNode> path){
        TreeNode curr=root;
        if (curr!=null){
            inorder(root.left,path);
            path.add(curr);
            inorder(root.right,path);
        }
        return path;
    }
}