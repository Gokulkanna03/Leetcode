class Solution {
    public boolean isPalindrome(String s) {
      
        if(s==" ") {
            return true;
        }
        else{
        s=s.toLowerCase().trim().replaceAll("[^a-z0-9]","");
        
        String rev=new StringBuilder(s).reverse().toString(); 
        if(s.equals(rev))
        {
            return true;
        }
        else{
            return false;
        }
           
    }
}
}