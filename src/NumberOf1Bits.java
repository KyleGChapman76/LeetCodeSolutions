//simple bitshift solution
//had the basic idea from the get go
//but had to look up some finer points
//especially about the difference between >>> and >> in java

public class NumberOf1Bits
{
	public int hammingWeight(int n) {
        
        int count = 0;
        
        while (n != 0)
        {
            if ((n & 1) == 1)
                count++;
            
            n >>>= 1;
        }
        
        return count;
    }
}
