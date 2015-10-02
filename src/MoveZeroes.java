//https://leetcode.com/problems/move-zeroes/
//a pretty simple in-place solution
//but i'm not experienced enough to calculate the complexity of it
//and leetcode doesn't have enough submissions to calculate how well mine performs in comparison to others

public class MoveZeroes
{
	public void moveZeroes(int[] nums)
    {
        outer: for (int i = 0;i<nums.length;i++)
        {
            int current = nums[i];
            if (current == 0)
            {
            	int swapIndex = i;
            	do
                {
                    swapIndex++;
                    if (swapIndex > nums.length -1)
                        break outer;
                } while (nums[swapIndex] == 0);
                
                int temp = nums[swapIndex];
                nums[swapIndex] = current;
                nums[i] = temp;
            }
        }
    }
}
