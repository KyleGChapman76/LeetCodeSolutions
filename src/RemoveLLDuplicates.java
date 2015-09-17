
public class RemoveLLDuplicates
{
	public ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
            return null;
            
        ListNode baseline = head;
        ListNode next  = baseline.next;
        
        while (next != null)
        {
            if (next.val == baseline.val)
                baseline.next = next.next;
            else
            	baseline = next;
            next = baseline.next;
        }
        
        return head;
    }
}
