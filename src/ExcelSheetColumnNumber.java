//this is one of my favorite solutions that i developed because
//i pretty much instantly knew what to do
//it also looks good and runs great

public class ExcelSheetColumnNumber
{
	public int titleToNumber(String s)
    {
        int cumulative = 0;
        
        for (int i = 0;i < s.length();i++)
        {
            char c = s.charAt(s.length()-1-i); //get the char ith from the end of the string
            cumulative += (c - 64) * (int)Math.pow(26,i);
            //c-64 converts c to an ascii value then subtracts 64 from it, giving
            //A = 1, B = 2, and so on
        }
        
        return cumulative;
    }
}
