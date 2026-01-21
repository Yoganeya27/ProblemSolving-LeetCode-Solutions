class Solution {
public:
    int subtractProductAndSum(int n) {
       int num=n,sum=0,product=1;
       while(num>0){
       sum+=num%10;
       product*=num%10;
       num=num/10;
    }
    return product-sum;
    }
};