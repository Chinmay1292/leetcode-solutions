class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 10;
        }
        else{
            int res = 10;
            int unique = 9;
            int ava = 9;

            for (int i = 2; i <= n && ava > 0; i++) {
                unique *= ava;
                res += unique;
                ava--;
            }
            return res;
        }
    }
}