//https://leetcode.com/problems/factorial-trailing-zeroes/
//i'm really proud of this solution
//at first i thought that this would be very computationally intensive
//but i was able to deduce the correct pattern by looking at lists of factorial numbers

public class FactTrailingZeroes
{
	//gains an extra trailing zero every 5
	//and another extra every 25
	//and so on
	public int trailingZeroes(int n)
    {
        if (n < 5)
            return 0;
        
        int numZeroes = 0;
        int tester = 5;
        
        while (tester <= n/5)
        {
            numZeroes += n / tester;
            tester *= 5;
        }
        
        numZeroes += n / tester;
        
        return numZeroes;
    }
}
