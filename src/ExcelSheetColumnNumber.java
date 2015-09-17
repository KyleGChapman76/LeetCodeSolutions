
public class ExcelSheetColumnNumber
{
	public int titleToNumber(String s)
    {
        int cumulative = 0;
        
        for (int i = 0;i < s.length();i++)
        {
            char c = s.charAt(s.length()-1-i);
            cumulative += (c - 64) * (int)Math.pow(26,i);
        }
        
        return cumulative;
    }
}
