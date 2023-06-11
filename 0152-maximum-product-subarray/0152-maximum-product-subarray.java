class Solution {
    public int maxProduct(int[] nums) {
        int maxPro=nums[0], currProMax=nums[0], currProMin=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                int temp=currProMax;
                currProMax=currProMin;
                currProMin=temp;
            }
            currProMax=Math.max(nums[i], currProMax*nums[i]);
            currProMin=Math.min(nums[i], currProMin*nums[i]);
            maxPro=Math.max(currProMax, maxPro);
        }
        return maxPro;
    }
}