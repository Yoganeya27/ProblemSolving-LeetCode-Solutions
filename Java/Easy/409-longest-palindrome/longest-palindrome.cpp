class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> freq(128, 0);
        for (char c : s) {
            freq[c]++;
        }
        int len = 0;
        bool Odd = false;
        for (int count : freq) {
            len += (count / 2) * 2;
            if (count % 2 == 1) {
                Odd = true;
            }
        }
        if (Odd) {
            len++;
        }
        return len;
    }
};