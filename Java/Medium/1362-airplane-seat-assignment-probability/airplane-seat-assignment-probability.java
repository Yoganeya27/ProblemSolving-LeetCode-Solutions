class Solution {
    public double nthPersonGetsNthSeat(int n) {
       if(n==1)
       return 1.00000;
       return 0.50000;
    }
}
  /*
        Key Observation:

        Person 1 does NOT know his seat, so he chooses randomly among n seats.

        Three possible cases after Person 1 sits:

        1) He sits in seat 1 (his own seat)
           -> Everyone else sits correctly
           -> Last person gets seat n
           -> SUCCESS

        2) He sits in seat n (last person's seat)
           -> Last person will have no choice
           -> FAILURE

        3) He sits in some middle seat k (2 <= k <= n-1)
           -> Person k now faces the SAME problem as person 1
           -> Problem resets with smaller group

        So eventually the situation always reduces to:
            Either seat 1 gets taken first OR seat n gets taken first

        Since both are equally likely,
        Probability = 1/2
        */