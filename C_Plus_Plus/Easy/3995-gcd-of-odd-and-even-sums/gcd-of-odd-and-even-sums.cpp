class Solution {
public:
    int gcdOfOddEvenSums(int n) {
        return n;
    }
};

/*
Sum Of Odd numbers within range  n OddSum=> n^2
Sum Of Even numbers within range n EvenSum=> n (n+1)
GCD ==> Difference of EvenSum - OddSum
    ==> n(n+1)-n*n
    ==> n*n + n -n*n
GCD ==> n
*/