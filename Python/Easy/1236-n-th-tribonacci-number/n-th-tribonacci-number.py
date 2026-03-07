class Solution:
    def tribonacci(self, n: int) -> int:
        n1=0
        n2=1
        n3=1
        sum=0
        if n==0:
            return 0
        for i in range (1,n-1):
            sum=n1+n2+n3
            n1=n2
            n2=n3
            n3=sum
        return n3