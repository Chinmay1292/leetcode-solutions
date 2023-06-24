class Solution {
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;
        if(n==0){
            return false;
        }
        int a = nums[0];
        for(int i=0; i<n; i++){
            a = gcd(a, nums[i]);
        }
        if(a==1) return true;

        return false;
    }
    public int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}