class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0,rev2=0,n=num;
        while(n>0){
            rev1=rev1*10+n%10;
            n/=10;
        }
          while(rev1>0){
            rev2=rev2*10+rev1%10;
            rev1/=10;
        }
        if(rev2==num)
        return true;
        return false;
    }
}