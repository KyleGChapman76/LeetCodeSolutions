//https://leetcode.com/problems/happy-number/
//performs the happy operation on the number until either 1 is reached (and therefore it is happy)
//or until a cycle begins (a number is reached which has already been visited)
//in which case the number is not happy

import java.util.HashSet;

public class HappyNumber
{
	public boolean isHappy(int n) {
        
        HashSet<Integer> visitedNumbers = new HashSet<Integer>();
        
        do
        {
            visitedNumbers.add(n);
            int temp = 0;
            while (n > 0)
            {
                int digit = n % 10;
                temp += digit * digit;
                n /= 10;
            }
            n = temp;
            
        } while (n != 1 && !visitedNumbers.contains(n));
        
        return n == 1;
    }
}
