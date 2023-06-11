class Solution {
    public boolean finVal(int[] nums, int original) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == original) {
                return true;
            } else if (nums[mid] < original) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original){
        Arrays.sort(nums);
        if(finVal(nums, original)==false)
        return original;
        original *= 2;
        return  findFinalValue(nums, original);
    }
}