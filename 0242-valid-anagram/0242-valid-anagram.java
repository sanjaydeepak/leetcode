class Solution {
    public boolean isAnagram(String s, String t) {
        int []count=new int[26];
        for(char c:s.toCharArray())
        {
            count[c-'a']++;
            //Adding of letters in the arrays
        }
        for(char c:t.toCharArray())
        {
            count[c-'a']--;
            //Taking of the letters from the arrays
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }

        }
        return true;
    }
}