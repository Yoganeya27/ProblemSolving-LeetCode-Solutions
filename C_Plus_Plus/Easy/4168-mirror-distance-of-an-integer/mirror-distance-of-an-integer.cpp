class Solution {
public:
    int mirrorDistance(int n) {
        int rev=0,num=n,diff=0;
        while(num>0){
             rev = rev * 10 + (num % 10);
            num=num/10;
        }
        diff= rev-n;
        if(diff<0)
        diff=-diff;
        return diff;
    }
};