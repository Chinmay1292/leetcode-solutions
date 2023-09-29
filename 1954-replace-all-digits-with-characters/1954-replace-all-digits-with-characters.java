class Solution {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray(); 
        for (int i = 1; i < chars.length; i += 2) {
        if(Character.isDigit(chars[i])){
            char prev = chars[i-1];
            int shift = chars[i] - '0';
            chars[i] = (char) (prev + shift);
        }
        }
        return new String(chars);
    }
}