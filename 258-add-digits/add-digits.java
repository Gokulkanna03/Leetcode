class Solution {
    public int addDigits(int num) {
        int temp=num;
        int sum=0;
        while(temp>9)
        {
            int b=temp%10;
            int c=temp/10;
            temp=b+c;        }
      
        return temp;
    } 
    }