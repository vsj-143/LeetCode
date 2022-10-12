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
// depth first search 
// visit the root node 
// traverse the left subtree
// traverse the right subtree
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
                List <Integer> list=new ArrayList<Integer>();

        if(root==null){
            return list;
        }
        Stack<TreeNode>stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            // System.out.print(temp.data+"");
            list.add(temp.val);
            if(temp.right!=null){
                stack.push(temp.right);
            }
             if(temp.left!=null){
                stack.push(temp.left);
            }
            
        }
        return list;
        
        
        
        
        
        // List <Integer> list=new ArrayList<Integer>();
//         dfs(root,list);
//         return list;}
        
//         private void dfs(TreeNode node,List<Integer> list){
        
        
//         if(node==null){
//      return ;   }
//        list.add(node.val);
//             dfs(node.left,list);
//             dfs(node.right,list);
    }
}