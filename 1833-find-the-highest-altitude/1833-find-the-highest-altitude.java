class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, highAlt = 0;

        for(var g : gain){
            altitude += g;
            highAlt = Math.max(highAlt, altitude);
        }
        return highAlt;
    }
}