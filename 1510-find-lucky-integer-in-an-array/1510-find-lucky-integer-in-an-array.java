class Solution {
    public int findLucky(int[] arr) {
        int[] c = new int[501];
        for(int n : arr){
            c[n]++;
        }
        int max = -1;
        for(int i=1; i<c.length; i++){
            if(c[i]==i) max = i; 
        }
        return max;
    }
}