class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev=0
        if x<0:
            return False
        num=x
        while num>0:
          rev=rev*10+num%10
          num//=10
        return rev==x