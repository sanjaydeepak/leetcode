class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        //It is a sorted Array that's why
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[index]=nums[i];
                index++;
            }
        }return index;
    }
}