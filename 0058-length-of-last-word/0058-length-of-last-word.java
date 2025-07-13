class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                count++;
            }
            else{
                if(count>0)
                break;
            }
        }
        return count;
    }
}