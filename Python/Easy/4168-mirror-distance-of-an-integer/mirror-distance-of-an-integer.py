class Solution:
    def mirrorDistance(self, n: int) -> int:
        num=n
        rev=0
        ans=0
        while(num>0):
            rev=rev*10+num%10
            num//=10
        ans=rev-n
        if(ans<0):
            ans=-ans
        return ans
        