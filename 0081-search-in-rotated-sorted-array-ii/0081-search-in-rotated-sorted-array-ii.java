class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;  // Found target
            }

            // **Key Fix: Handle Duplicates**
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;  
                end--;  
                continue; // Skip and retry
            }

            // **Left half is sorted**
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;  // Search left
                } else {
                    start = mid + 1;  // Search right
                }
            }
            // **Right half is sorted**
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;  // Search right
                } else {
                    end = mid - 1;  // Search left
                }
            }
        }
        return false; // Target not found
    }
}
