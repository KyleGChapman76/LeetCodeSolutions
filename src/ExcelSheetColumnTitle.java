//https://leetcode.com/submissions/detail/40328787/
//A similar idea to the opposite problem
//The problem is to convert base 10 to base 26 (with characters instead of numbers)

public class ExcelSheetColumnTitle
{
	public String convertToTitle(int n)
    {
        String title = "";
        
        while (n > 0)
        {
            int lastDigit = n % 26; //get the smallest base-26 number in n
            if (lastDigit == 0) //if its 0, then the last number is actually Z
                lastDigit = 26;
            title = (char)(lastDigit+64) + title; //get the ascii char that goes with the digit number
            
            //make the second to last digit the new last digit
            n -= lastDigit;
            n /= 26;
        }
        
        return title;
    }
}
