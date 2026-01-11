class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum+=n%k;
            n /= k;
        }
        return sum;
    }
}

/*Decimal to Any Base (Base 10 → Base k)

-->Divide n by k → get quotient and remainder.remainder is the current digit in the new base (starting from rightmost/least significant digit)

-->quotient becomes the number for the next step

-->Repeat division with the quotient until it becomes 0

-->Read the remainders in reverse order → this gives the number in base k*/
