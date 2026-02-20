class Solution {
    public int alternateDigitSum(int n) {

        // count total digits
        int digits = 0, temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int count = 0, oddsum = 0, evensum = 0, num = n, digit = 0;

        while (num > 0) {
            digit = num % 10;
            count++;

            // corrected sign decision
            if ((digits % 2 == 1 && count % 2 == 1) ||
                (digits % 2 == 0 && count % 2 == 0)) {
                oddsum += digit;      // positive position
            } else {
                evensum += -digit;    // negative position
            }

            num /= 10;
        }

        return oddsum + evensum;
    }
}