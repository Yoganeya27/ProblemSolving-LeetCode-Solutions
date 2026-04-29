class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1; i >= 0; i--){ //When adding 1 to a number, we start from the rightmost digit.
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0; // To replace trailing 9 with 0;
        }
  int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}