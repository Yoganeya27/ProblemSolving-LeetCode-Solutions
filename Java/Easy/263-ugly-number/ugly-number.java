class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        if (n == 1)
       return true;
       else
       return false;
    }
}
/* Logic:
   Continuously divide the number by 2, 3, and 5 as long as it is divisible.
   This removes all allowed prime factors.
   If the remaining value becomes 1, the number had no other prime factors → Ugly Number.
   If a value other than 1 remains, it contains other prime factors → Not Ugly.*/
