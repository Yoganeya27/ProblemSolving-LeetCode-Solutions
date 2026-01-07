class Solution {
    public int countOdds(int low, int high) {
        int i,count=0;
        if(low%2==0){
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