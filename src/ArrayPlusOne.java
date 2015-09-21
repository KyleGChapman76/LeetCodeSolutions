public class ArrayPlusOne
{
	public int[] plusOne(int[] digits) {
        int loc = digits.length-1; //start at the last digit
        boolean overflow = false; //if we need another digit on the left because of overflow
        
        //add one to the current location
        //if that overflows it, move onto the next digit
        //until either no overflow occurs
        //or unless we reach the last digit, in which case
        //overflow of the whole array has occurred
        do
        {
            digits[loc]++;
            if (digits[loc] == 10)
            {
                digits[loc] = 0;
                if (loc == 0)
                {
                    overflow = true;
                    break;
                }
                loc--;
            }
            else
            {
                break;
            }
        } while (true);
        
        //if overflow happened for the whole array, make a new array one size bigger
        if (overflow)
        {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1; //the left most digit will be 1
            for (int i = 0;i<digits.length;i++)
            {
                newDigits[i+1] = digits[i]; //each other digit will be what in the modified array
            }
            return newDigits;
        }
        
        return digits;
    }
}
