class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ss = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            ss[i] = nums[i]*nums[i];
        }
        Arrays.sort(ss);
        return ss;
    }
}