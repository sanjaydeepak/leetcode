class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer>set1=new HashSet<>();
        Set <Integer>set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2); // retainAll is a java Set interface which is used to return the same value from the two different sets.// 
        int []ans=new int[set1.size()];
        int j=0;
        // Normally set does'nt has index so the j is used;
        for(int element:set1)
        {
                  ans[j++]=element;
        }

        return ans;
    }
}