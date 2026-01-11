class Solution {
    public long removeZeros(long n) {
        long rev = 0;

        while (n > 0) {
            long digit = n % 10;
            if (digit != 0) {
                rev = rev * 10 + digit;
            }
            n /= 10;
        }

        
        long result = 0;
        while (rev > 0) {
            result = result * 10 + rev % 10;
            rev /= 10;
        }
        return result;
    }
}
