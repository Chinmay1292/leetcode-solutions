class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int c1 = 0;
        int a = nums[0];
        int b = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            if(a==nums[i]) c++;
            else if(b==nums[i]) c++;
        }
        return nums.length-(c+c1);
    }
}