class Solution {
    public boolean divisorGame(int n) {
        return n%2==0; //If n is even, Alice can always subtract 1, leaving an odd number for Bob. From an odd number, every move gives the next player an even number.
    }
}