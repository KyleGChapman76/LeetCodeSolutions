//another solution calling for a depth first search
//this time just keeping track of the sum of each element in the stack as it is
//nodes are pushed onto or popped from it
//and when at a leaf node and having a matching sum, returning true
//otherwise if finishing navigating, return false

import java.util.HashSet;
import java.util.Stack;

public class PathSum
{
	public boolean hasPathSum(TreeNode root, int sum)
    {
        if (root == null)
            return false;
        
        Stack<TreeNode> dfStack = new Stack<TreeNode>();
        dfStack.push(root);
        
        HashSet<TreeNode> visited = new HashSet<TreeNode>();
        
        int sumOfStack = root.val;
        
        while (dfStack.size() != 0)
        {
            TreeNode current = dfStack.peek();
            
            TreeNode left = current.left;
            TreeNode right = current.right;
            
            if (left != null && !visited.contains(left))
            {
                dfStack.push(left);
                visited.add(left);
                sumOfStack += left.val;
            }
            else if (right != null && !visited.contains(right))
            {
                dfStack.push(right);
                visited.add(right);
                sumOfStack += right.val;
            }
            else
            {
                if (left == right && sumOfStack == sum)
                    return true;
                sumOfStack -= dfStack.pop().val;
            }
        }
        return false;
    }
}
