class Solution {
public:
    int commonFactors(int a, int b) {
        int count=0;
        int c=max(a,b); // To find the ending range
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0)
            count++;
        }
        return count;
    }
};