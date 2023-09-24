class Solution {
    public boolean squareIsWhite(String coordinates) {
        char l = coordinates.charAt(0);
        char d = coordinates.charAt(1);
        if((l%2==1 && d%2==1) || (l%2==0 && d%2==0)){
            return false;
        }
        return true;
    }
}