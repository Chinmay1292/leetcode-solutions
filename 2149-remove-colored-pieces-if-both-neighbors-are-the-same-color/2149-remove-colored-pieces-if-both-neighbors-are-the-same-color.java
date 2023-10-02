class Solution {
    public boolean winnerOfGame(String colors) {
        boolean res = false;
        int aC = count(colors, 'A');
        int bC = count(colors, 'B');
        if(aC>bC){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }

    private int count(String s, char ch){
        int c = 0;
        int i=1;

        while(i<s.length()-1){
            if(s.charAt(i)==ch && s.charAt(i-1)==ch && s.charAt(i+1)==ch)
            c++;
            i++;
        }
        return c;
    } 
}