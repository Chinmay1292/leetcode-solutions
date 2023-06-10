class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    i++;
                    break;
                }
                if(j==nums.length-1){
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];
    }
}