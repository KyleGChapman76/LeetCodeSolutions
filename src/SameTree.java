import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
        if (p == null)
            return q == null;
        
        Queue pQueue = new LinkedList();
        pQueue.add(p);
        
        Queue qQueue = new LinkedList();
        qQueue.add(q);
        
        while (!pQueue.isEmpty())
        {
            TreeNode pCurrent = (TreeNode)pQueue.remove();
            TreeNode qCurrent = (TreeNode)qQueue.remove();
            
            if (qCurrent == null || pCurrent == null)
            {
                if (qCurrent != pCurrent)
                {
                    return false;
                }
                continue;
            }
            
            if (qCurrent.val != pCurrent.val)
            	return false;
            
            pQueue.add(pCurrent.left);
            pQueue.add(pCurrent.right);
            
            qQueue.add(qCurrent.left);
            qQueue.add(qCurrent.right);
        }
        
        return true;
    }
}
