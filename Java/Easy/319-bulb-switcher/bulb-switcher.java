class Solution {
    public int bulbSwitch(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            count++;
        }
        return count;
    }
}

/* We have n bulbs initially OFF.
Each bulb is toggled once for every divisor it has.
If a bulb is toggled even number of times → it becomes OFF.
If a bulb is toggled odd number of times → it remains ON.
Only numbers with an odd number of divisors stay ON.
Only perfect square numbers have an odd number of divisors.
Therefore, only bulbs at positions:
1, 4, 9, 16, 25, ... (perfect squares)
will remain ON after all rounds.
So the final answer is:
Count how many perfect square numbers are less than or equal to n.
In other words:
Count all i such that i*i <= n.*/