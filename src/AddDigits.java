//https://leetcode.com/problems/add-digits/
//shamelessly stolen from a solution posted in the leetcode discussion for this problem
//no credit for solving it, but useful for me to write it out nonetheless

public class AddDigits
{
	public int addDigits(int num) {
    	while (num > 9)
    	{
    		int temp = 0;
    		while (num > 0)
    		{
    			if (num < 10)
    			{
    				temp += num;
    				break;
    			}
    			temp += num % 10;
    			num = num / 10;
    		}
    		num = temp;
    	}
    	return num;
    }
}
