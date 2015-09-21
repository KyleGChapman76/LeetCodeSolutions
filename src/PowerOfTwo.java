//this is a much much better solution than the one i had on here before
//i had to learn a lot more about bit operations and become more comfortable using them
//before this kind of solution could make sense to me
//really happy with the result

public class PowerOfTwo
{
	public boolean isPowerOfTwo(int n) {
        boolean hasFoundOne = false;
        while (n != 0) //if the number is zero its either zero or a power of two
        {
            if ((n & 1) == 1) //if the rightmost bit is 1
            {
            	//if weve already seen a 1 bit, then it cant be a power of two
                if (hasFoundOne)
                    return false;
                hasFoundOne = true;
            }
            n = n >> 1; //bitshift right by 1
        }
        return hasFoundOne;
        //when the number becomes zero its either zero
        //in which case hasFoundOne is false and so returns false (the correct answer for zero)
        //or its some number that has some number of leading zeroes before its first non-zero value
        //which means that it is a power of two
        //and therefore hasFoundOne is true so returns true
    }
}
