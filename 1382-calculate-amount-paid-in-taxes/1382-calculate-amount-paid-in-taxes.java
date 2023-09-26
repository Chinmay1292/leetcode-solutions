class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int p = 0;
        double tax = 0;

        for(int[] b : brackets){
            if(income <=0){
                break;
            }
            int diff = Math.min((b[0] - p), income);

            tax += (double) diff * ((double) b[1]/100);

            income -= diff;
            p = b[0];
        }
        return tax;
    }
}