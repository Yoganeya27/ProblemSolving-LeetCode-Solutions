class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
/*                               (OR)
class Solution {
    public int mySqrt(int x) {
        int i = 1;

        while (i * i <= x) {
            i++;
        }

        return i - 1;
    }
} */