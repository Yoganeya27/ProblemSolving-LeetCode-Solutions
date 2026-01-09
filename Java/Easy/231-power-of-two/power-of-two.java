class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
            return n==1; 
    }
}

/*If a number is divisible by 2 repeatedly (like 2, 4, 8…):

It keeps getting divided by 2 inside the while loop.

Eventually, n becomes 1 (because powers of two eventually reduce to 1).

After the loop, n == 1 → returns true.

If a number is not a power of two (like 3, 6, 12…):

It either never enters the while loop (if it’s odd) or the loop stops at a number greater than 1 that isn’t divisible by 2.

After the loop, n != 1 → returns false.*/