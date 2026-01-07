class Solution {
    public int addDigits(int num) {
        int n = num;

        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;   // sum is assigned back to n for next round
        }
        return n;      // final single-digit result
    }
}
