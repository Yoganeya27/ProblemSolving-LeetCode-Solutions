class Solution {
    public int mirrorDistance(int n) {
        int rev=0,num=n,diff;
        while(num!=0){
            rev=rev*10+num%10; //% 10 extracts digits from right to left,* 10 pushes existing digits left
            num=num/10;
        }
        diff=n-rev;
        if(diff<0)
        diff=-diff;
        return diff;
    }
}