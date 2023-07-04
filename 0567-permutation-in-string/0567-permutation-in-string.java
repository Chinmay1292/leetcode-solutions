class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int n1 = s1.length(), n2 = s2.length();
        char[] c = s1.toCharArray();
        Arrays.sort(c);

        for(int i=0; i<n2-n1+1; i++){
            String s = s2.substring(i, i+n1);
            char[] c2 = s.toCharArray();
            Arrays.sort(c2);
            if(Arrays.equals(c, c2)){
                return true;
            }
        }
        return false;
    }
}