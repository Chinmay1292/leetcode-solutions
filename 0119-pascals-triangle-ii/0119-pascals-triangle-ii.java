class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long p = 1;
        for(int k=1; k<=rowIndex; k++){
            long n = p*(rowIndex - k + 1)/k;
            res.add((int) n);
            p = n;
        }
        return res;
    }
}