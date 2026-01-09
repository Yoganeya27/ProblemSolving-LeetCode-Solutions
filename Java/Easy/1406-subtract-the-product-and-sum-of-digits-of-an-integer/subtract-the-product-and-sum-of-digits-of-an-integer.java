class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1,digit=0,diff=0;
        while(n!=0){
            digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;
        }
        diff=product-sum;
        return diff;
    }
}