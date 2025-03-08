class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int majority = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                majority = nums[i];

            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        //Using Boyer-Moore-Voting-Algorithm

       return majority;
    }
}