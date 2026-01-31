import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    } 
} 
/*                             (OR)
class Solution {
    public int[] sortArray(int[] nums) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];

        // Count frequency
        for (int num : nums) {
            count[num]++;
        }

        int index = 0;

        // Rebuild sorted array
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                nums[index++] = i;
            }
        }

        return nums;
    }
}
*/