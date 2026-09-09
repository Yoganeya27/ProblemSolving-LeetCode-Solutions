class Solution {
    public int countCommas(int n) {
        long x=n;
        if(x<1000) {
            return 0;
        }
        return n-999;
    }
}