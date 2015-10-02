//https://leetcode.com/problems/length-of-last-word/
//go from the end of the string until you arrive at a space occurring after (before) a non-space
//keep track of every non-space character in the length variable
//then return that as the length of the last word

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
