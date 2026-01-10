class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
         boolean Bulky= false,Heavy= false;
         
         long Volume=(long)length*width*height;
         if(length >= 10000 || width >= 10000 || height >= 10000||Volume >= 1000000000) {
            Bulky=true;
         }
        if(mass>=100){
            Heavy=true;
        }
        if(Bulky&&Heavy) return "Both";
        if(Bulky) return "Bulky";
        if(Heavy) return "Heavy";
        return "Neither";
    }
}