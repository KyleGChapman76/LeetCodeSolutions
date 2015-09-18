//a simple if bad solution
//just divide it by two until you get to 0, 1, or a number that isn't disivible by 2
//to determine if the number is a power of two

//i saw some bitwise solutions to this, might try those out eventually

public class PowerOfTwo
{
	public boolean isPowerOfTwo(int n) {
        while (n > 0)
        {
            if (n == 1)
                return true;
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return false;
    }
}
