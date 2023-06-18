class Solution {
    public int findValueOfPartition(int[] nums) {
        int x = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if((nums[i]-nums[i-1])<x)
            {
                x=(nums[i]-nums[i-1]);
            }
        }
        
        return x;
    }
}