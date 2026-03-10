class Solution {
public:
    int addDigits(int num) {
        while(num>9){
            int sum=0;
        while(num>0){
        sum+=num%10;
        num=num/10;
        }
          num=sum;  // Since sum was declared inside the while loop !
        }
        return num;
    }
};