class Solution {
    public boolean isPalindrome(int x) {
        int n=x,digit=0;
        while(n>0){
            digit=digit*10+n%10;
            n/=10;
        }
        if(digit==x)
        return true;
        return false;
    }
}