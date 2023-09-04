class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(h.contains(nums[i])){
                a.add(nums[i]);
            }
            else{
                h.add(nums[i]);
            }
        }
        return a;
    }
}