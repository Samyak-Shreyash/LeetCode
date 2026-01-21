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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        Stack<TreeNode> stk = new Stack();
        while(root!=null || !stk.empty()) {
            while(root!=null)
            {    
                stk.push(root);
                root= root.left;
            }
            root=stk.pop();
            inOrderList.add(root.val);
            root= root.right;
            }
            return inOrderList;
        }
}