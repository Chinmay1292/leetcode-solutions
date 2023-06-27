class Solution {
    public int buyChoco(int[] arr, int money) {
        // int n = arr.length;
        // int minMon = Integer.MAX_VALUE;
        // int diff;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         diff = arr[i] + arr[j];
        //         if(diff<=money){
        //             minMon = Math.min(minMon, diff);
        //         }
        //     }
        // }
        // if(minMon<=money){
        //     return money - minMon;
        // }
        // return money;
        
        // 2nd approach

        Arrays.sort(arr);
        int p1 = arr[0], p2 = arr[1];
        int total = p1+p2;
        if(total<=money){
            return money-total;
        }
        return money;
    }
}