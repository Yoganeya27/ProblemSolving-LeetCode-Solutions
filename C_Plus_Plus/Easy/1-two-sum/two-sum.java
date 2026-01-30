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
   /*                                   (OR)
   Using HashMap
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to reach target
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // found the pair
            }
            map.put(nums[i], i); // store current number for future check
        }

        return new int[]{-1, -1}; // if no pair found
    }
}
*/
