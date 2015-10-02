//https://leetcode.com/problems/invert-binary-tree/
//a simple solution
//using breadth first search, every time you reach a new node
//just swap the left and right children of the node

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
	
	public TreeNode invertTree(TreeNode root) {
		
        if (root == null)
            return null;
        
        Queue queue = new LinkedList();
        
        queue.add(root);
        
        while (!queue.isEmpty())
        {
            TreeNode current = (TreeNode)queue.remove();
            TreeNode left = current.left;
            TreeNode right = current.right;
            
            current.left = right;
            current.right = left;
            
            if (left != null)
            {
                queue.add(left);
            }
            
            if (right != null)
            {
                queue.add(right);
            }
        }
        
        return root;
    }
}
