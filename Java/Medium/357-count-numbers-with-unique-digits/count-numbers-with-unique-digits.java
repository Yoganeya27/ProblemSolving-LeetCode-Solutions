class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0) return 1;      // 10^0 = 1
        if (n == 1) return 10;     // 10^1 = 10 (Unique digits 0,1,2,3,4,5,6,7,8,9)

        int result = 10; // From 0-9 there are 10 Unique digits (fixed)
        int current = 9; // For 2-digit(and longer) numbers, the first digit has 9 choices (1–9) because it cannot be 0.

        for (int i = 2; i <= n; i++) {
            current *= (10 - (i - 1));
            result += current;
        }

        return result;
    }
}