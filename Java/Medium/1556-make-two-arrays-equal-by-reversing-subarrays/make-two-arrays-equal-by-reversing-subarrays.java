import java.util.Arrays;
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
          int[] newArr = Arrays.copyOf(arr, arr.length);
           Arrays.sort(newArr);
           Arrays.sort(target);
        if(Arrays.equals(target, newArr)){
        return true;
        }
        return false;
    }
}