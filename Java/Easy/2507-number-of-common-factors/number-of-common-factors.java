class Solution {
    public int commonFactors(int a, int b) {
        int i,count=0,limit;

        if (a<b)
        limit=b;
        else
        limit=a;
        
        for(i=1;i<=limit;i++){
        if(a%i==0 && b%i==0){
            count++;
        }
     }
        return count;
    }
}