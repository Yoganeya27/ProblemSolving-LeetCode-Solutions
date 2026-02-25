class Solution:
    def fib(self, n: int) -> int:
     n1=0
     n2=1
     sum=0
     if(n==0):
        return 0
     for i in range (2,n+1):
        sum=n1+n2
        n1=n2
        n2=sum
     return n2