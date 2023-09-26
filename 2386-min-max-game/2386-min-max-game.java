class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        int[] nnums = new int[n/2];
        for(int i=0; i<nnums.length; i++){
            if(i%2==1)
            nnums[i] = Math.max(nums[2*i], nums[2*i+1]);
            else
            nnums[i] = Math.min(nums[2*i], nums[2*i+1]);
        }
        return minMaxGame(nnums);
    }
}