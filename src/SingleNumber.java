import java.util.HashSet;

public class SingleNumber
{
	public int singleNumber(int[] nums) {
        
        HashSet seen = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            if (seen.contains(n))
            {
                seen.remove(n);
            }
            else
            {
                seen.add(n);
            }
        }
        
        return (int)seen.toArray()[0];
        
    }
}
