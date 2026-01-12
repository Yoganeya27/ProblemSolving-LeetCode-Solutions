class Solution {
public:
    bool isPalindrome(int x) {
      if(x<0){
        return false;
      }
      int n2=x,i;
      long sum=0;
      while(x>0){
        i=x%10;
        sum=(sum*10)+i;
        x=x/10;
      }
      return n2==sum;
    }
};