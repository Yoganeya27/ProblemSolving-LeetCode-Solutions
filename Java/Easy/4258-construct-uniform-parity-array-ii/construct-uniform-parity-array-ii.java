class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallOdd = Integer.MAX_VALUE;

        // Find the smallest odd number
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                smallOdd = Math.min(smallOdd, nums1[i]);
            }
        }

        // If there is no odd number, array is already uniform
        if (smallOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Every even number must be greater than the smallest odd
        for (int num : nums1) {
            if (num % 2 == 0 && num <= smallOdd) {
                return false;
            }
        }

        return true;
    }
}