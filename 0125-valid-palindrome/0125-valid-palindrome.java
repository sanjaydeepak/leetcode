class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
            str+=s.charAt(i);
           }
           
        }
        str=str.toLowerCase();
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            j--;
        }
        return true;
    }
}