class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=num,divisor=1,sum=0;
        while(divisor <= num / 2){ // Divisors are always less than half of a number
            if(num%divisor==0){
                sum+=divisor;
            }
            divisor++;
        }
        if(sum==num){
            return true;
        }else return false;
    }
}