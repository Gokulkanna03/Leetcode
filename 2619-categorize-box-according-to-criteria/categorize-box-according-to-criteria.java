class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long) length*width*height;
        boolean Bulky=length>=10000||width>=10000||height>=10000||volume>=1000000000L;
        boolean Heavy=mass>=100;
        if(Bulky && Heavy) return "Both";
        if(Bulky) return "Bulky";
        if(Heavy) return "Heavy";
        else return "Neither";
    }
}