//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

import java.util.HashSet;
import java.util.Stack;

public class TreeLowestCommonAncestor {
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
		if (root == p || root == q || root == null)
        	return root;
		//if the root is null then the entire tree is null, so return null
		//if the root is either p or q then the root is the lcm, since going down the tree
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        if (left != null)
        {
        	if (right != null)
        	{
        		TreeNode leftLCA = lowestCommonAncestor(left, p, q);
        		TreeNode rightLCA = lowestCommonAncestor(right, p, q);
        		
        		if (leftLCA != null)
        		{
        			if (rightLCA != null) 
        				return root;
        				//if both are not null, then this is the LCA
        			else 
        				return leftLCA; 
        				//if the right is null and left isn't
        				//then the left is either the LCA or the location
        				//of p or q
        		}
        		else if (rightLCA != null)
        		{
        			return rightLCA;
        			//if the left is null and right isn't
    				//then the right is either the LCA or the location
    				//of p or q
        		}
        		return null;
        	}

        	return lowestCommonAncestor(left, p, q);
        	//if you have only a right child, then this cannot possibly by the LCA, so just return
        	//whatever you get from LCA on the left child (getting eith the LCA down that branch
        	//or the location of either p or q)
        }
        
        if (right != null)
    	{
    		return lowestCommonAncestor(right, p, q);
    		//the same logic applies as last comment
    	}
   
        //if both are null, then this is an end node and cannot possibly by an ancestor
        //to either p or q
        return null;
    }
}
