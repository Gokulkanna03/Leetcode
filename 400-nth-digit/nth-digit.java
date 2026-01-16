class Solution {
    public int findNthDigit(int n) {
        if (n < 10) return n; 
        long digitLength = 1;        
        long count = 9;            
        long start = 1;              
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / digitLength;
        String s = Long.toString(start);
        return s.charAt((int)((n - 1) % digitLength)) - '0';
    }
}
