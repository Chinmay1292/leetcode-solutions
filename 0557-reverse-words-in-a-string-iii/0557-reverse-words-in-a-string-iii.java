class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st : str){
            StringBuilder rev = new StringBuilder();
            for(int i=st.length()-1; i>=0; i--){
                rev.append(st.charAt(i));
            }
            sb.append(rev).append(" ");
        }
        return sb.toString().trim();
    }
}