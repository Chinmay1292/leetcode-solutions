class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] mid = new int[n*m];
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mid[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(mid);
        int x = mid[k-1];
        return x;
    }
}