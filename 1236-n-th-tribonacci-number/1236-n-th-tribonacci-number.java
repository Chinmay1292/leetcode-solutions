class Solution {
    public int tribonacci(int n) {
        int x=0, y=1, z=1;
        if(n==0 || n==1) return n;
        if(n==2) return z;
        for(int i=3; i<=n; i++){
            int sum = x+y+z;
            x=y;
            y=z;
            z=sum;
        }
        return z;
    }
}