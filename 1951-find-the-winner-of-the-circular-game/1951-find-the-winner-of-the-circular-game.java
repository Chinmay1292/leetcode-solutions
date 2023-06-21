class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans = (ans+k)%i;
        }
        return ans+1;
    }
}