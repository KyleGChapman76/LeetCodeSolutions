import java.util.HashMap;

public class RomanToInteger {
	
	private static HashMap<Character, Integer> valueMap = new HashMap<Character, Integer>();
    
    public static int romanToInt(String s) {
        
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);
        
        if (s.length() == 1)
        {
        	return valueMap.get(s.charAt(0));
        }
        
        int cumulative = 0;
        int counter = s.length()-1;
        
        //until we reach the end of the program
        while (counter >= 0)
        {
            char current = s.charAt(counter);
            int currentValue = valueMap.get(current);
            
           // System.out.println(counter + " : " + current + " : " + currentValue);
            
            if (counter == 0)
            {
            	 //System.out.println("Adding " + currentValue + " to the cumulative.");
            	cumulative += currentValue;
            	break;
            }
            
            char next = s.charAt(counter-1);
            int nextValue = valueMap.get(next);
            
            //System.out.println("Adding " + currentValue + " to the cumulative.");
            cumulative += currentValue;
            
            int moveAmount = 1;
            
            //if we need to check some subtractive numbers
            if (currentValue > nextValue)
            {
            	for (int i =counter-1;i>=0;i--)
            	{
            		int searchingValue = valueMap.get(s.charAt(i));
            		if (currentValue > searchingValue)
            		{
            			//System.out.println("Subtracting " + searchingValue + " from the cumulative.");
            			cumulative -= searchingValue;
            			moveAmount++;
            		}
            	}
            }
            counter -= moveAmount;
        }
        
        return cumulative;
    }
}
