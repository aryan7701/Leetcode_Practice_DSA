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
     return isSymmetric(p,q);
 }
 
 boolean isSymmetric(TreeNode left,TreeNode right){
     if(left==null || right==null)
         return left==right;
     if(left.val!=right.val)
         return false;
    return isSymmetric(left.left,right.left) &&isSymmetric(left.right,right.right);
 }
}