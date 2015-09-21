//pretty good solution
//not much to say
//learning the value of writing my algorithms in pencil and paper
//before trying to code anything. Especially useful when working on tree problems.

import java.util.LinkedList;
import java.util.Queue;

public class IsTreeSymetric
{
	
	public boolean isSymmetric(TreeNode root)
    {
        if (root == null) return true;
            
        if (root.left == null && root.right == null)
            return true;
        else if (root.left == null || root.right == null)
            return false;
            
        if (root.left.val != root.right.val) return false;
        
        Queue queueLeft = new LinkedList();
        queueLeft.offer(root.left);
        Queue queueRight = new LinkedList();
        queueRight.offer(root.right);
        
        while(queueLeft.size() != 0 && queueRight.size() != 0)
        {
            TreeNode cLeft = (TreeNode)queueLeft.poll();
            TreeNode cRight  = (TreeNode)queueRight.poll();
            
            if (cLeft == null && cRight == null)
                continue;
            else if (cLeft == null || cRight == null)
            	return false;
            
            if (cLeft.val != cRight.val) return false;
                
            queueLeft.offer(cLeft.left);
            queueLeft.offer(cLeft.right);
            queueRight.offer(cRight.right);
            queueRight.offer(cRight.left);
        }
        
        return true;
    }
}
