class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);
        return result;
    }
    
    private int binarySearch(int[] nums, int target, boolean first) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                result = mid;
                
                if (first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}