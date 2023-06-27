class Solution {
    public int buyChoco(int[] arr, int money) {
        int n = arr.length;
        int minMon = Integer.MAX_VALUE;
        int diff;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                diff = arr[i] + arr[j];
                if(diff<=money){
                    minMon = Math.min(minMon, diff);
                }
            }
        }
        if(minMon<=money){
            return money - minMon;
        }
        return money;
    }
}