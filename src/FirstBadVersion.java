//https://leetcode.com/problems/first-bad-version/
//i don't know how i like this solution
//on the one hand the algorithm i think is very nice
//however the reliance on using longs may not be the best way of handling overflow
//but I'm not really sure

public class FirstBadVersion
{
	public int firstBadVersion(int n)
    {
        if (n == 1)
            return 1;
        
        long highestGood = 0;
        long lowestBad = (long)n+1;

        long search = n/2;
        while (lowestBad > highestGood+1)
        {
            if (isBadVersion((int)search))
                lowestBad = search;
            else
                highestGood = search;
            search = (highestGood + lowestBad)/2;
        }
        
        return (int)lowestBad;
    }

	//this function needs to exist so that this class can compile
	//it doesn't have the same function as the function as it exists
	private boolean isBadVersion(int n) {
		return n >= 0;
	}
}
