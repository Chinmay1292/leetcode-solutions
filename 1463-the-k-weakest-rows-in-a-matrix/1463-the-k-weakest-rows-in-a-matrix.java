class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rS = new int[mat.length][2];

        for(int i=0; i<mat.length; ++i){
            int s = 0;
            for(int v : mat[i]){
                s += v;
            }
            rS[i][0] = s;
            rS[i][1] = i;
        }
        Arrays.sort(rS, (a,b)->a[0]==b[0]?a[1]-b[1] : a[0]-b[0]);

        int[] res = new int[k];
        for(int i=0; i<k; ++i){
            res[i] = rS[i][1];
        }
        return res;
    }
}