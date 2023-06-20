class Solution {
    public int countDigits(int num) {
        int m = num, ans = 0;
        while(num>0){
            if(m%(num%10)==0)
            ans++;
            num/=10;
        }
        return ans;
    }
}