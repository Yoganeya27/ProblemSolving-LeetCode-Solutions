import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length,count=0;
int[] arr = Arrays.copyOf(heights, heights.length);
Arrays.sort(arr);
         for(int i=0;i<n;i++){
            if(arr[i]!=heights[i])
            count++;
         }
         return count;
    }
}