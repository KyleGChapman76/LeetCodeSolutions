import java.util.HashSet;

public class RemoveDuplicates
{
	public static void main (String[] args)
	{
		int[] nums = new int[180000];
		for (int c = 0;c< nums.length;c++)
		{
			nums[c] = -999+c/2;
		}
		int newSize = removeDuplicates(nums);
		for (int i = 0;i<newSize;i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	public static int removeDuplicates(int[] nums)
    {
        HashSet<Integer> seen = new HashSet<Integer>();
        
        int newSize = 0;
        
        int c = 0;
        outer: while (c < nums.length)
        {
            int current = nums[c];
            
            if (seen.contains(current))
            {
                int swapIndex = c+newSize+1;
            	do
                {
                    swapIndex++;
                    if (swapIndex > nums.length -1)
                        break outer;
                } while (seen.contains(nums[swapIndex]));
                
                int temp = nums[swapIndex];
                nums[swapIndex] = current;
                nums[c] = temp;
                
                seen.add(temp);
            }
            else
            {
                seen.add(current);
                newSize++;
            }
            c++;
        }
        
        return newSize;
    }
}
