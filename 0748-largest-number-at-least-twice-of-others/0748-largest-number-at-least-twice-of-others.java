class Solution {
    public int dominantIndex(int[] nums) {
        int x = 0;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]>nums[x]){
                x=i;
            }
        }

        for(int i=0; i<n; i++){
            if(i!=x && nums[x]<2*nums[i]){
                return -1;
            }
        }
        
        return x;
    }
}