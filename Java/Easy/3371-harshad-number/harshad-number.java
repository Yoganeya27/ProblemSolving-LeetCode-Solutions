class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
          int i=x;
        int sum=0;
        while(i!=0){
           int digit=i%10;
            sum+=digit;
            i=i/10;
        }
        if(x%sum==0){
            return sum;
        }else return -1;
    }
}
