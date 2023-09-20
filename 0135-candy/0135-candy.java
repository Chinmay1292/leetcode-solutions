class Solution {
    public int candy(int[] ratings) {
        if(ratings.length==0){
            return 0;
        }

        int n = ratings.length;
        int[] candies = new int[n];

        for(int i=0; i<n; i++){
            candies[i] = 1;
        }

        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = 1+candies[i-1];
            }
        }

        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1] && candies[i]<=candies[i+1]){
                candies[i] = 1+candies[i+1];
            }
        }
        int total = 0;
        for(int cand : candies){
            total +=  cand;
        }
        return total;
    }
}