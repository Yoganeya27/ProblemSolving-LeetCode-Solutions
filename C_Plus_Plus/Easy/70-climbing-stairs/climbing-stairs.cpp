class Solution {
public:
    int climbStairs(int n) {
        if (n <= 2) return n;
        int oneStepBefore = 2, twoStepsBefore = 1, currentWays;
        for (int i = 3; i <= n; i++) {
            currentWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentWays;
        }
        return currentWays;
    }
};
