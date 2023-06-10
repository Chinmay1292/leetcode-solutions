class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int zerocount = 0;
        int p = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                zerocount++;
            }
            else{
            p*=nums[i];
            } 
        }
        
            if(zerocount>1){
                return ans;
            }
            else if(zerocount == 1){
                for (int i = 0; i < n; i++) {
                    if (nums[i] == 0) {
                        ans[i] = p;
                        break;
                    }
                }
            }
            else{
            for(int i=0; i<nums.length; i++){
            ans[i] = p/nums[i];
            }
        }
        return ans;
    }
}