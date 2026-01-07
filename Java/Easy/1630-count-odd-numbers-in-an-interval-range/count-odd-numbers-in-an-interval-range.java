class Solution {
    public int countOdds(int low, int high) {
        int i,count=0;
        if(low%2==0){   // To Prevent TLE(Time Limit Exception).start from the first odd number until high increasing by 2 numbers 
            low++;
        }
        for(i=low;i<=high;i+=2){
            if(i%2!=0){
            count++;
            } 
        }
        return count;
    }
}
/*                         (OR)
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);  // Counts the odd numbers between low and high (inclusive) by taking all odds from 1 to high and subtracting all odds from 1 to low-1.

    }
}
*/