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
/*                                (OR)
Using Sort
import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
             if(i!=nums[i]){
              return i;// If index and value don't match, i is missing
             }
        }
        return nums.length; // If all positions match, the missing number is nums.length
    }
}
*/