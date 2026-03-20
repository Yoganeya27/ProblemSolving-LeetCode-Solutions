import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length; //// If all positions match, the missing number is nums.length
    }
} 
                                /* OR
                                class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;
      for (int num : nums) {  // Sum all elements in the array
            actualSum += num;
        }
        return expectedSum - actualSum; // Missing number = expected sum - actual sum
    }
}
*/