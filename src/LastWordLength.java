
public class LastWordLength {
	
	public int lengthOfLastWord(String s) {
    	
    	if (s.length() == 0)
    		return 0;
    		
        if (s.length() == 1 && s.charAt(0) != ' ')
    	    return 1;
    	
    	boolean firstFound = false;
    	
    	int length = 0;
        for (int i = s.length()-1;i>=0;i--)
        {
        	if (s.charAt(i) == ' ')
        	{
        		if (firstFound) break;
        	}
        	else
        	{
        		length++;
        		if (!firstFound)
        			firstFound = true;
        	}
        }
     
        return length;
    }
	
}
