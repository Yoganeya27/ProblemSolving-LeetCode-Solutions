class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) { //Outer loop picks one number nums[i].
            for (int j = i + 1; j < nums.length; j++) { //Inner loop checks every number after i (nums[j]) so we don’t repeat pairs.
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
