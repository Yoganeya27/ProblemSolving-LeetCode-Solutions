class Solution {
public:
    int findClosest(int x, int y, int z) {
        int diff1 = x-z;
        int diff2 = y-z;
        if(diff1<0) diff1=-diff1;
        if(diff2<0) diff2=-diff2;
        if(diff1==diff2) return 0;
        if(diff1<diff2)  return 1;
        return 2;
    }
};
/*                          (OR)
class Solution {
public:
    int findClosest(int x, int y, int z) {
        int diff1 = (x - z) * (x - z);    //gives the squared distance → always positive

        int diff2 = (y - z) * (y - z);   
        return (diff1 == diff2) ? 0 : (diff1 < diff2 ? 1 : 2); Ternary operator chooses the closest person
    }
}; */