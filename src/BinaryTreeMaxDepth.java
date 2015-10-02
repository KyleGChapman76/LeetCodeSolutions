//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//finds the max depth of a binary tree
//does this by comparing the size of the depth first search stack
//at every node with the discovered max depth

import java.util.HashSet;
import java.util.Stack;

public class BinaryTreeMaxDepth
{
	public int maxDepth(TreeNode root)
    {
        int maxDepth = 0;
        
        Stack<TreeNode> dfStack = new Stack<TreeNode>();
        dfStack.push(root);
        
        HashSet<TreeNode> visited = new HashSet<TreeNode>();
        
        while (dfStack.size() != 0 && dfStack.peek() != null)
        {
            int depth = dfStack.size();
        	if (depth > maxDepth)
        		maxDepth = depth;
        	
        	TreeNode current = dfStack.peek();
        	
        	TreeNode left = current.left;
        	TreeNode right = current.right;
        	
        	if (left != null && !visited.contains(left))
        	{
        		dfStack.push(left);
        		visited.add(left);
        	}
        	else if (right != null && !visited.contains(right))
        	{
        		dfStack.push(right);
        		visited.add(right);
        	}
        	else {
				dfStack.pop();
			}
        }
        
        return maxDepth;
    }
}
