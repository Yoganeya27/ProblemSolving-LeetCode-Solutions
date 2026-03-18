class Solution {
    public boolean sumOfNumberAndReverse(int num) {
             int sum=0,i=0;
        for(i=0;i<=num;i++){
            int rev=0;
            int j=i;
            while(j>0){
                int digit=j%10;
                rev=rev*10+digit;
                j=j/10;
            }
         if(rev+i==num){
         return true;
         }
    }
         return false;
    }
}