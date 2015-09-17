
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
