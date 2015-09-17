import java.util.HashMap;

public class ValidAnagram
{
	public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
            return false;
        HashMap sMap = new HashMap<Character, Integer>();
        for (int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            Object currentValue = sMap.get(c);
            if (currentValue == null)
            {
                sMap.put(c, 1);
            }
            else
            {
                sMap.put(c, (Integer)currentValue+1);
            }
        }
        for (int i = 0;i<t.length();i++)
        {
            char c = t.charAt(i);
            Object valueInS = sMap.get(c);
            if (valueInS == null)
            {
                return false;
            }
            else
            {
                int newValue = (Integer)valueInS-1;
                if (newValue > 0)
                    sMap.put(c, newValue);
                else
                    sMap.remove(c);
            }
        }
        return true;
    }
}
