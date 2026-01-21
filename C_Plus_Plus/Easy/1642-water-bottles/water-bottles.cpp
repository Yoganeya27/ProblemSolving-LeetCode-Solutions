class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;      // start with full bottles
        int empty = numBottles;      // track empty bottles

        // keep exchanging empty bottles for full ones
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // exchange empties
            total += newBottles;                   // drink the new bottles
            empty = empty % numExchange + newBottles; // update remaining empty bottles
        }

        return total;
    }
};
