public class RotateArray {
		
    public void Solution (int[] nums, int k)
    {
        int size = nums.length;
        int numSwaps = 0;
        int offset = 0;
        while (numSwaps < size)
        {
        	int i = offset;
        	int stored = nums[i];
        	while (true)
            {
                int newPos = i+k;
                while (newPos > size-1)
                {
                    newPos = (newPos - size);
                }
                int temp = stored;
                stored = nums[newPos];
                nums[newPos] = temp;
                
                numSwaps++;
                
                i = newPos;
                if (i == 0 || numSwaps >= size)
                	break;
            }
        	offset++;
        }
    }
}