class Solution {
    public int findClosest(int x, int y, int z) {
        int stepx,stepy;
        stepx = z-x;
        stepy=z-y;

        if(stepx<0)          // To convert -ve stepx values into +ve stepx values
        stepx=-stepx;
        if(stepy<0)         // To convert -ve stepx values into +ve stepx values
        stepy=-stepy;
       
        if(stepx>stepy)   
        return 2;
        else if(stepy>stepx)
        return 1;
        else
        return 0;
    }
}