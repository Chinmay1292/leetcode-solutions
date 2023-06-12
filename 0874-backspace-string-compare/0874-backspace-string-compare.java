class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();
        Stack<Character> T = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='#'){
                if(!S.isEmpty()) S.pop();
            }
            else S.push(c);
        }
        for(char c: t.toCharArray()){
            if(c=='#'){
                if(!T.isEmpty()) T.pop();
            }
            else T.push(c);
        }
        return S.equals(T);
    }
}