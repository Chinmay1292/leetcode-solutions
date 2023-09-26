class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i : nums){
            if(map.containsKey(i*-1)){
                max = Math.max(max, Math.abs(i));
            }
            map.put(i, 0);
        }
        return max;
    }
}