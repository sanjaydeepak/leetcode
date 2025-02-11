class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)
        {
            return false;
        }
        int original=x;
        int last;
        int rev=0;
        while(x>0)
        {
           // last=x%10;
           rev=rev*10+(x%10);
            x/=10;
           
        }return rev==original;
    }
}