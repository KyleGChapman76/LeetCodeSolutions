import java.util.HashSet;

public class ContainsDuplicate
{
	public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> contains = new HashSet<Integer>();   
        
        for (int i = 0;i<nums.length;i++)
        {
            int current = nums[i];
            if (contains.contains(current))
                return true;
            contains.add(current);
        }
        
        return false;
    }
}
