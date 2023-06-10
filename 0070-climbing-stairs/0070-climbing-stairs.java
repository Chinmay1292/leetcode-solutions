class Solution {
    public int climbStairs(int n) {
        int pre =1;
        int temp =0;
        int curr =1;
        for(int i=1; i<n; i++){
            temp=curr;
            curr=pre+curr;
            pre=temp;
        }
        return curr;
    }
}