class Solution {
    public int gcdOfOddEvenSums(int n) {
        int OddSum=n*n;
        int EvenSum=n+(n*n);
        return EvenSum-OddSum;
    }
}