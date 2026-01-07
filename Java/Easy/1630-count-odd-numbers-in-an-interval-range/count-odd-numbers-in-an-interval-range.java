class Solution {
    public int countOdds(int low, int high) {
        int count = 0;

        // Start from the first odd number >= low
        if (low % 2 == 0) {
            low++; // make it odd
        }

        // Loop through all odd numbers only
        for (int i = low; i <= high; i += 2) {
            count++;
        }

        return count;
    }
}
